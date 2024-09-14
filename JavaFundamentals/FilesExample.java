import java.io.*;
import java.nio.file.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class FilesExample {

    // Method to write data to a file using FileWriter
    private static void writeFile(String filename, String data) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
            System.out.println("Data written to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file using FileReader
    private static void readFile(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to process a file as a stream using Files.lines
    private static void processFileStream(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file stream.");
            e.printStackTrace();
        }
    }

    // Method to read the whole file into a string using Files.readString (Java 11+)
    private static void readFileAsString(String filename) {
        try {
            String content = Files.readString(Paths.get(filename));
            System.out.println("File content:\n" + content);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file as a string.");
            e.printStackTrace();
        }
    }

    // Method to write a string to a file using Files.writeString (Java 11+)
    private static void writeFileAsString(String filename, String data) {
        try {
            Files.writeString(Paths.get(filename), data);
            System.out.println("Data written to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file as a string.");
            e.printStackTrace();
        }
    }

    // Method to make an API call and parse the response
    private static void makeApiCall(String apiUrl) {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                System.out.println("API Response:\n" + response.toString());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while making the API call.");
            e.printStackTrace();
        }
    }

    // Method to delete a file
    private static void deleteFile(String filename) {
        try {
            Files.deleteIfExists(Paths.get(filename));
            System.out.println("File deleted: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Define filename and API URL
        String filename = "example.txt";
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";

        // Demonstrate file operations
        writeFile(filename, "Hello, World!");
        readFile(filename);
        processFileStream(filename);
        readFileAsString(filename);
        writeFileAsString(filename, "Updated content.");
        readFileAsString(filename);
        deleteFile(filename);

        // Demonstrate API call
        makeApiCall(apiUrl);
    }
}
