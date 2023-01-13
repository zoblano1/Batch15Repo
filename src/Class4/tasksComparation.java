package class4;

public class tasksComparation {
    public static void main(String[] args) {
        boolean diploma=true;
        double gpaScore=3.5;


        if(diploma){
            System.out.println("Congratulations!");}
        else{
            System.out.println("Get a degree.");}
        if(diploma){if(gpaScore>=3.5) System.out.println("you are eligible for scholarship.");}
        else{
            System.out.println("you should studied harder.");}

    }
}
