package class4;

public class NestIfDemo6 {
    public static void main(String[] args) {

        int money = 1000;
        String day = "Sunday";
        boolean mood = true;
        if (money > 700) {
            if (mood) {
                System.out.println("Lets go shopping");
            }
        } else  {
            System.out.print("lets save more money first");

        }

    }
}

