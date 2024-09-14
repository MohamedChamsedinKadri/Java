package JavaFundamentals;

public class Loops {

    public static void main(String[] args) {
        // 1. For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. For-Each Loop
        System.out.println("\nFor-Each Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // 3. While Loop
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // 4. Do-While Loop
        System.out.println("\nDo-While Loop:");
        int doCount = 0;
        do {
            System.out.println("Do Count: " + doCount);
            doCount++;
        } while (doCount < 5);
    }
}
