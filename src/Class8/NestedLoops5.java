package Class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        /* print  0 1 2 3 4 5
    }             1 2 3 4 5
                  2 3 4 5
         */
        for(int i =0; i <=5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int j=1; j<5; j++){
            System.out.print(j+" ");
        }
        for (int i=2; i<5; i++){
        System.out.println();
    }
    System.out.println();
}}
