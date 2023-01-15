package Class5;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        /* Write a program for user to enter his/hers birth month.
        Based on the month define the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”. */


        Scanner scan = new Scanner(System.in);
        System.out.println("What month were you born in?");
        String month = scan.nextLine();
        if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")){
            System.out.println("Summer");
       }else{
        System.out.println("You were born in "+month);
    }
    }
}
