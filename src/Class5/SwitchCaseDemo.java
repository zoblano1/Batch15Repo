package Class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country = "USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) {
            case "USA":
                System.out.println("Burgers");
            case  "italy":
                System.out.println("Pasta");
            case  "turkey":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}