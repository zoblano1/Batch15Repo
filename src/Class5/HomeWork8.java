package Class5;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        /*
         Using scanner class create calculator.
         Allow user to enter 2 numbers and operator(+,-,*,/).
         Based on operator provide the result to user.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 number and operators +,-,*,/ " );
        double num1= scan.nextDouble();
        char operators=scan.next().charAt(0);
        double num2= scan.nextDouble();

        switch (operators){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;


        }
    }
}
