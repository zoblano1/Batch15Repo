package Class5;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country= scan.nextLine();
        switch (country){
            case "Usa":
            System.out.println("English");
            break;
            case "Germany":
                System.out.println("German");
                break;
            case  "Sweden":
                System.out.println("Swedish");
                break;
            case "France":
                System.out.println("French");
                break;
            case "Spain":
                System.out.println("Spanish");
            default:
                System.out.println("You are not from this planet");


        }

        }
    }

