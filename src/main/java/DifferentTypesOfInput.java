
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
            String text = scanner.nextLine();
        
        System.out.println("Give an integer:");
            int integer = Integer.valueOf(scanner.nextLine());
                    
        System.out.println("Give a double:");
            Double floatingpoint = Double.valueOf(scanner.nextLine());

        
        System.out.println("Give a boolean:");
            boolean trueorfalse = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatingpoint);
        System.out.println("You gave the boolean " + trueorfalse);
    }
}
