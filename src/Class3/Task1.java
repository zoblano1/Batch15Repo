package class4;

public class Task1 {
    public static void main(String[] args) {

        boolean diploma = true;
        float gpa = 3.5f;

        if (diploma) {
            System.out.println("Congratulations");

        } else {
            System.out.println("Get degree");
        }
        if (diploma) {
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }

        }
    }
}



