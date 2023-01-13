package class4;

import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("What is the amount of loan you need it");
        int amount= value.nextInt();
        if (amount<=200000){
            System.out.println("We can land you a money");
        } else {
            System.out.println("We have to reject you");
        }







    }
}
