package Class7;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
/*
Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off anymore”
 */
        boolean workDay = true;
        int day = 1;
        while (workDay) {
            System.out.println("I need a day off");
            if (day >= 5) {
                workDay = false;
            }
            day++;
        }
                System.out.println("I don't need day off anymore");


            }
        }


