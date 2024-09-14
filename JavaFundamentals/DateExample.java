package JavaFundamentals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

    public static void main(String[] args) {
        // 1. Working with LocalDate - Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // 2. Working with LocalTime - Current Time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // 3. Working with LocalDateTime - Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // 4. Formatting Date and Time using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted Time: " + formattedTime);

        // 5. Creating a specific Date
        LocalDate specificDate = LocalDate.of(2024, 9, 13);
        System.out.println("Specific Date: " + specificDate);

        // 6. Creating a specific Time
        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println("Specific Time: " + specificTime);

        // 7. Creating a specific Date and Time
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 9, 13, 14, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);
    }
}
