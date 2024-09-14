package JavaFundamentals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicSyntax {

    public static void main(String[] args) throws IOException {
        // Using BufferedReader to take input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Using BufferedReader:");
        System.out.print("Enter a string: ");
        String strBuffered = bufferedReader.readLine();
        System.out.println("Entered String: " + strBuffered);

        System.out.print("Enter an integer: ");
        int intBuffered = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Entered Integer: " + intBuffered);

        // Using Scanner to take input for different data types
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUsing Scanner:");

        // Reading boolean value
        System.out.print("Enter a boolean: ");
        boolean boolScanner = scanner.nextBoolean();
        System.out.println("Entered Boolean: " + boolScanner);

        // Reading byte value
        System.out.print("Enter a byte: ");
        byte byteScanner = scanner.nextByte();
        System.out.println("Entered Byte: " + byteScanner);

        // Reading double value
        System.out.print("Enter a double: ");
        double doubleScanner = scanner.nextDouble();
        System.out.println("Entered Double: " + doubleScanner);

        // Reading float value
        System.out.print("Enter a float: ");
        float floatScanner = scanner.nextFloat();
        System.out.println("Entered Float: " + floatScanner);

        // Reading integer value
        System.out.print("Enter an integer: ");
        int intScanner = scanner.nextInt();
        System.out.println("Entered Integer: " + intScanner);

        // Reading line using nextLine
        System.out.print("Enter a line of text: ");
        scanner.nextLine(); // Consume leftover newline
        String lineScanner = scanner.nextLine();
        System.out.println("Entered Line: " + lineScanner);

        // Reading long value
        System.out.print("Enter a long: ");
        long longScanner = scanner.nextLong();
        System.out.println("Entered Long: " + longScanner);

        // Reading short value
        System.out.print("Enter a short: ");
        short shortScanner = scanner.nextShort();
        System.out.println("Entered Short: " + shortScanner);

        scanner.close();
    }
}
