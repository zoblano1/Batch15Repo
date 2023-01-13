package class4;

import java.util.Scanner;

public class TaskCityTemp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city");
        String city = input.nextLine();
        System.out.println("Please enter temperature");
        double temperature = input.nextDouble();
        System.out.println("The temperature in " + city + " is " + (temperature  -32)*5/9);
    }
}





