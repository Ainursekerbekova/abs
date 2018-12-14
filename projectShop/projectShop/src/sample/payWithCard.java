package sample;

import java.util.Scanner;

public class payWithCard implements payAbility {
    public void pay() {
        Scanner in = new Scanner(System.in);
        boolean paid = false;
        while(paid != true) {
            boolean ok = true;
            System.out.println("Enter card number (wwww xxxx yyyy zzzz) : ");
            String card = in.nextLine();
            System.out.println("Enter date of expiration (mm/yy) : ");
            String date = in.nextLine();
            System.out.println("Enter cvc code (xxx) : ");
            String cvc = in.nextLine();
            String[] cardnums = card.split(" ");
            for(int i = 0; i < cardnums.length; i++)
                if(cardnums[i].length() != 4) {
                    System.out.println("wrong card number, Try again");
                    ok = false;
                }
            if(!ok)
                continue;
            if(date.length() != 5 || date.charAt(2) != '/') {
                System.out.println("Wrong date of expiration, Try again");
                continue;
            }
            String x = "";
            int lim = 12;
            for(int i = 0; i < date.length(); i++) {
                if(date.charAt(i) == '/') {
                    if(Integer.parseInt(x) < 1 || Integer.parseInt(x) > lim) {
                        ok = false;
                        break;
                    }
                    x = "";
                    lim = 40;
                }
                else if(date.charAt(i) >= 48 && date.charAt(i) <= 57) {
                    x += date.charAt(i);
                }
                else {
                    ok = false;
                    break;
                }
            }
            if(!ok) {
                System.out.println("Wrong date of expiration, Try again");
                continue;
            }
            if(cvc.length() != 3) {
                System.out.println("Wrond cvc code, Try again");
                continue;
            }
            for(int i = 0; i < cvc.length(); i++) {
                if(cvc.charAt(i) < 48 || cvc.charAt(i) > 57) {
                    ok = false;
                    break;
                }
            }
            if(!ok) {
                System.out.println("Wrond cvc code, Try again");
                continue;
            }
            System.out.println("Payment has been successful");
            paid = true;
        }
    }
}
