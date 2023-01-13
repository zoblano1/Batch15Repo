package Class7;

public class Task7 {
    public static void main(String[] args) {

        /*
        Print even numbers from 20 to 1 (2 ways)
         */
        int num = 20;
        while (num >= 1) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                num -= 2;
            }


            while (num >= 1) {
                if (num % 2 != 1) {
                    System.out.print(num + " ");
                    num -= 2;
                }
            }

        }}}

