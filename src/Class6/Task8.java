package Class6;

public class Task8 {
    public static void main(String[] args) {
        /*
        Print odd numbers between 20 and 50 (2 ways)
         */
        int num=21;
         while(num<=50){
            if(num%2!=0)
                System.out.print(num+ " ");
            num++;
        }
        System.out.print("***********");

    for(num=20;num<50;num++){
        if (num%2 !=0)
        System.out.print(num+ " ");
    }
}}

