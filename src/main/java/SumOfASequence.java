
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last Number? ");

        int userInput = Integer.valueOf(scanner.nextLine());
        int sequence = 1;
        int result = 0;

        for (int i = 1; i <= userInput; i++) {
            result = result + i;
        }
        System.out.println("The sum is " + (result));
    }
}
