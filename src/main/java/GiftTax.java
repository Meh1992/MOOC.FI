
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int valueofgift = Integer.valueOf(scan.nextLine());
        
        if (valueofgift < 5000) { 
            System.out.println("No tax!");
        } else if (valueofgift >= 5000 && valueofgift <= 25000) {
            double tax1 = (100 + (valueofgift - 5000) * 0.08);
            System.out.println(tax1);
        } else if (valueofgift >= 25000 && valueofgift <= 55000) {
            double tax2 = (1700 + (valueofgift - 25000) * 0.10);
            System.out.println(tax2);
        } else if (valueofgift >= 55000 && valueofgift <= 200000) {
            double tax3 = (4700 + (valueofgift - 55000) * 0.12);
            System.out.println(tax3);
        } else if (valueofgift >= 200000 && valueofgift <= 1000000) {
            double tax4 = (22100 + (valueofgift - 200000) * 0.15);
            System.out.println(tax4);
        } else if (valueofgift > 1000000) {
            double tax5 = (142100 + (valueofgift - 1000000) * 0.17);
            System.out.println(tax5);
        } 

    }
}