
public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(100);

    }

    public static void printFromNumberToOne(int number) {
        int end = 1;

        while (number >= 1 ) {
            System.out.println(number);
            number--;
        }
    }
}
