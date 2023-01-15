package class4;

public class Task2 {
    public static void main(String[] args) {
        float rate=2.9f;
        int price=300000;
        if(rate>4.5) {
            System.out.println("User will not buy a house");
        } else {
            System.out.println("User will consider buying");
            if(rate<4.5) if(price>200000) {
                System.out.println("User will take a loan");
            } else {
                System.out.println("User will pay cash");
            }
        }
    }
}
