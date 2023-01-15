package Class8;

public class NestedLoops3 {
    public static void main(String[] args) {

        for (int i =0; i < 3; i++){              // outer loop//
            for (int j = 0; j < 5; j++){         // inner loop//
                if(j==1||j==2){
                    continue;
                }
                System.out.print("* ");        // printing code horizontal //
            }
            System.out.println();              // print code vertical //
        }
    }
}
