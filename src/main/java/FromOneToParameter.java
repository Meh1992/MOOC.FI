

public class FromOneToParameter {

    public static void main(String[] args) {
        
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number) {
        int numberToPrint = 1;
        while (numberToPrint<= number) {
            System.out.println(numberToPrint);
            numberToPrint++;
        }
    }
}
