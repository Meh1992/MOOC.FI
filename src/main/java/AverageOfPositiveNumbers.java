
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
                count = count + 1;
            }

        }
        System.out.println((1.0 * sum / count));

    }
}
