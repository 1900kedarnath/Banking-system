import java.io.*;
import java.util.*;
import com.Bank3.*;

public class main {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome in our bank");
        System.out.println("press 1 for open account");
        System.out.println("press 2 for transfer money");
        System.out.println("press 3 for balance inquiry");
        System.out.println("press 4 for checking details");
        System.out.println("press 5 for exit");
        Bank3 obj = new Bank3();
        int option = 0;
        do {
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter account number");
                    String accountNumber = sc.next();
                    System.out.println("Enter pin");
                    int pin = sc.nextInt();
                    obj.openAccount(accountNumber, pin);
                    break;
                case 2:
                    System.out.println("Enetr sender accountNumber");
                    String senderaccountNumber = sc.next();
                    System.out.println("Enetr reciever accountNumber");
                    String recieveraccountNumber = sc.next();
                    System.out.println("Enetr transfering amount");
                    double transamount = sc.nextDouble();
                    obj.sendmoney(senderaccountNumber, recieveraccountNumber, transamount);
                    break;
                case 3:
                    System.out.println("enter account number");
                    String number1 = sc.next();
                    obj.checkbalance(number1);
                    break;
                case 4:
                    System.out.println("enter account number");
                    String number2 = sc.next();
                    obj.checkdetail(number2);
                case 5:
                    if (option == 5) {
                        System.out.print("Thank you for using our service");
                        return;
                    }
            }
        } while (option != 5);
    }
}
