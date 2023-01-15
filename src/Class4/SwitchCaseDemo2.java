package Class4;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        String day = "Friday";
        switch (day) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
            default:
                System.out.println("Wrong day");


        }
    }
}
