package class4;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter you city and temperature");
        String city= input.nextLine();
        double temperature= input.nextDouble();
        System.out.println("The temperature is "+(temperature-32) *5/9 + " the city is " +city);



    }
}
