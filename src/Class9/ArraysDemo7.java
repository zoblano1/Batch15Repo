package Class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        double[] c={10.5,12.0,45,10.5,23,10.5};
        // write a program that can tell us how many times the number 10.5 is present in the array//

        int count=0;
        for(int i=0; i<c.length;i++){
            if(c[i]==10.5){
                count++;
                System.out.println(count);

            }
        }
    }
}
