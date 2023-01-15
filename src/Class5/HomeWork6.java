package Class5;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        Write a program to find largest number among three numbers
        using nested if provided by a user (numbers must be distinct)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three number");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("Largest number is " +num1);
        } else if(num2>num1&&num2>num3){
            System.out.println("The largest num is " +num2);
        }else{
            System.out.println("The largest number is " +num3);

        }

    }
}