package sample;

import java.util.Scanner;

public class payWithQiwi implements payAbility{
    public void pay() {
        Scanner in = new Scanner(System.in);
        boolean paid = false;
        while (paid != true) {
            boolean ok = true;
            System.out.println("Enter phone number: ");
            String phoneNumber = in.next();
            System.out.println(phoneNumber);
            for(int i = 0; i < phoneNumber.length(); i++) {
                if(phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                    ok = false;
                    break;
                }
            }
            if(!ok)
                continue;
            System.out.println("Enter code from sms:");
            String code = in.next();
            for(int i = 0; i < code.length(); i++) {
                if(code.charAt(i) < 48 || code.charAt(i) > 57) {
                    ok = false;
                    break;
                }
            }
            if(!ok)
                continue;
            System.out.println("Payment has been successful");
            paid = true;
        }
    }
}
