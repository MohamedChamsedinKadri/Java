package JavaFundamentals;

public class DataTypes {

    // Instance variable
    int instanceVar = 100; // Instance variable (Non-static)

    // Static variable
    static String staticVar = "Static Variable"; // Static variable

    public static void main(String[] args) {

        // Local variables
        int localVar = 50; // Local variable
        System.out.println("Local Variable: " + localVar);

        // Primitive data types
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 10.5f;
        double doubleVar = 20.99;
        boolean boolVar = true;
        char charVar = 'A';

        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("char: " + charVar);

        // Non-Primitive data types
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5}; // Array
        DataTypes dt = new DataTypes(); // Class instance

        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String: " + str);
        System.out.println("Array element: " + arr[0]); // Accessing array
        System.out.println("Instance Variable: " + dt.instanceVar); // Accessing instance variable

        // Accessing static variable
        System.out.println("Static Variable: " + staticVar);
    }
}
