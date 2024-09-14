package JavaFundamentals;

import java.io.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        // Example of Checked Exception (IOException)
        System.out.println("Checked Exception Example:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        // Example of Unchecked Exception (ArithmeticException)
        System.out.println("\nUnchecked Exception Example:");
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero.");
        }

        // Example of Error (StackOverflowError)
        System.out.println("\nError Example:");
        try {
            recursiveCall(); // This will cause StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: " + e);
        }
    }

    // Recursive method to cause StackOverflowError
    public static void recursiveCall() {
        recursiveCall();
    }
}
