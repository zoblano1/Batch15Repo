package Class6;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        Write a program to find largest of three double values using if-else..
        if and logical operators provided by a user (numbers must be distinct)

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter three distinct numbers");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        double c=scan.nextDouble();

        if(a>b&&a>c) {
            System.out.println("Largest number is " +a);
        } else if(b>a&b>c) {
            System.out.println("Largest number is " + b);
        } if(a<c&&b<c){
            System.out.println("Largest number is " +c);
        }

    }
}