package JavaFundamentals;

import java.util.function.Consumer;

public class Function {
    
    // 1. Defining a simple function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. A function to print a message
    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        
        // 3. Calling a function to add two numbers
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        // 4. Calling a function to print a message
        printMessage("Hello from Function.java!");

        // 5. Using a lambda function to add two numbers
        // Lambda syntax: (parameters) -> expression
        Addition lambdaAdd = (x, y) -> x + y;
        int lambdaSum = lambdaAdd.add(30, 40);
        System.out.println("Lambda Sum: " + lambdaSum);

        // 6. Passing a function as a variable using method reference
        final Consumer<Integer> simpleReference1 = Function::exampleMethod;
        simpleReference1.accept(5);
    }

    // 7. A function to be used with method reference
    public static void exampleMethod(int value) {
        System.out.println("Value passed: " + value);
    }

    // 8. Defining a functional interface for lambda
    @FunctionalInterface
    interface Addition {
        int add(int x, int y);
    }
}
