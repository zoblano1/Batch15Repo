package class4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("We can issue DL");
        } else {
            System.out.println("Get a learners permit");
        }
    }
}