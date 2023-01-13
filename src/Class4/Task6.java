package class4;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a credit card?");
        boolean card = input.nextBoolean();
        if (card) {
            System.out.println("Whats your balance");
            int balance = input.nextInt();
            if(balance>1000) {
                System.out.println("Pay it off immediately");
            } else{
                System.out.println("You can spend it more");
            }} else {
                System.out.println("Would you apply for one?");
            }


        }


    }










