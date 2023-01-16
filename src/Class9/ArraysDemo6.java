package Class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

                //create an array and store 10,20,30,4,5,6,80
                // add all the elements which are multiply with 2

        int [] b={10,20,30,4,5,6,7,80};
        int sum=0;
        for(int i=0; i< b.length;i++){
            if (b[i]%2==0){
                sum=sum+b[i];}}
                System.out.println(sum);


    }
}
