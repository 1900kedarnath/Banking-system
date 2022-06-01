package com.Bank;

import java.util.*;

public class Bank3 {
    private HashMap<String, customer> user = new HashMap<>();

    public Bank3() {
    };

    Scanner sc = new Scanner(System.in);

    public void openAccount(String accountNumber, int pin) {
        customer newcustomer = new customer(accountNumber, pin);
        if (user.containsKey(accountNumber)) {
            System.out.println("this account number already exist");

        } else {

            System.out.println("deposite money");

            double money = sc.nextDouble();
            newcustomer.depositemoney(money);
            System.out.println("Enter mobile number");
            String number = sc.next();
            newcustomer.savemobileNumber(number);
            user.put(accountNumber, newcustomer);
            System.out.print("Account successfully created");
        }
    }

    public void sendmoney(String userAccountNumber, String recieveraccountNumber, double amount) {
        customer sender = user.get(userAccountNumber);
        if (sender.findbalance() >= amount) {
            System.out.print(" Money is transfering");
            customer reciever = user.get(recieveraccountNumber);
            sender.depositemoney(sender.findbalance() - amount);
            reciever.depositemoney(reciever.findbalance() + amount);
            System.out.print("Remaining balance" + sender.findbalance());
        } else
            System.out.print("Balance is insufficient");
    }

    public void checkbalance(String accountNumber) {

        if (user.containsKey(accountNumber)) {
            customer obj2 = user.get(accountNumber);
            System.out.print(obj2.findbalance());
        } else
            System.out.println("Invalid account number");
    }

    public void checkdetail(String accountNumber) {
        if (user.containsKey(accountNumber)) {
            customer sender1 = user.get(accountNumber);
            System.out.println(sender1.findbalance());
            System.out.println(sender1.findpin());
            System.out.println(sender1.findmobileNumber());

        } else
            System.out.println("Invalid account number");

    }
}

    
}
