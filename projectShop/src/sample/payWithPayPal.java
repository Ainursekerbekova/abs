package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class payWithPayPal implements payAbility{
    private Map<String, String> users = new HashMap<>();
    public void update() {
        users.put("bruce@wayne.com", "batman");
        users.put("peter@griffin.com", "bird");
        users.put("homer@simpson.com", "donuts");

    }
    public void pay() {
        update();
        Scanner in = new Scanner(System.in);
        boolean paid = false;
        while (paid != true) {
            System.out.println("Enter user email : ");
            String email = in.next();
            System.out.println("Enter user password : ");
            String pass = in.next();
            if(users.get(email).equals(pass)) {
                System.out.println("Payment has been successful");
                paid = true;
            } else {
                continue;
            }
        }
    }
}
