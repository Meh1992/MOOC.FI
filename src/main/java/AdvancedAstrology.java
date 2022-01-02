
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int countPrinted = 0;

        while (countPrinted < number) {

            System.out.print("*");

            countPrinted = countPrinted + 1;

        }

        System.out.println("");

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int countPrinted = 0;

        while (countPrinted < number) {

            System.out.print(" ");

            countPrinted = countPrinted + 1;

        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int numSize = 0;
        while (numSize < size) {
            printSpaces(size - numSize - 1);
            printStars(numSize + 1);
            numSize++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 0;
        while (i < height) {
            printSpaces(height - 1 - i);
            printStars(2 * i + 1);
            i++;
        }
        int y = 0;
        while (y <= 1) {
            printSpaces(height - 2);
            printStars(3);
            y++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(100);
        System.out.println("---");
        christmasTree(10);
    }
}
