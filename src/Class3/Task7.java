package class4;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your work years and your salery");
        int years=input.nextInt();
        int salery= input.nextInt();
        if(years>=5) {
            System.out.println("You are eligible for bonus");
        }    else{
            System.out.println("You are not");
        }if(years>=5) if(salery>50000) {
            System.out.println("Your bonus will be 5000");
        }    else {
            System.out.println("Bonus will be 3000");
        }

    }
}
