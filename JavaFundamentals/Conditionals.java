package JavaFundamentals;


package JavaFundamentals;

public class Conditionals {
    public static void main(String[] args) {
        
        // If-Else statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }

        // Else-If statement
        int y = 15;
        if (y > 20) {
            System.out.println("y is greater than 20");
        } else if (y > 10) {
            System.out.println("y is greater than 10 but less than or equal to 20");
        } else {
            System.out.println("y is less than or equal to 10");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Ternary operator
        int a = 25;
        String result = (a > 20) ? "a is greater than 20" : "a is less than or equal to 20";
        System.out.println(result);
    }
}
