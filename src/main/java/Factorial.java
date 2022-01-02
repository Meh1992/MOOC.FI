
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int userNumber = Integer.valueOf(scanner.nextLine());
        int number = 1;
        int sum = 1;
        
        while (number <= userNumber) {
            sum = sum * number;
            number++;
        }
        System.out.println("Factorial: " + sum);
    }
}
