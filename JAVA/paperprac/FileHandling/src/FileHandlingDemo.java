import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {

    static final String FILE_NAME = "mytextfile.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== FILE HANDLING SYSTEM ======");
            System.out.println("1. Create File");
            System.out.println("2. Write to File (Overwrite)");
            System.out.println("3. Append to File");
            System.out.println("4. Read File");
            System.out.println("5. Delete File");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> createFile();
                case 2 -> writeFile(sc);
                case 3 -> appendFile(sc);
                case 4 -> readFile();
                case 5 -> deleteFile();
                case 0 -> System.out.println("System exit initiated.");
                default -> System.out.println("Invalid selection.");
            }

        } while (choice != 0);

        sc.close();
    }

    // -------- CREATE FILE --------
    static void createFile() {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("File creation failed.");
        }
    }

    // -------- WRITE FILE (OVERWRITE) --------
    static void writeFile(Scanner sc) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            System.out.print("Enter content: ");
            String content = sc.nextLine();
            writer.write(content);
            System.out.println("Write operation successful.");
        } catch (IOException e) {
            System.out.println("Write operation failed.");
        }
    }

    // -------- APPEND FILE --------
    static void appendFile(Scanner sc) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            System.out.print("Enter content to append: ");
            String content = sc.nextLine();
            writer.write("\n" + content);
            System.out.println("Append operation successful.");
        } catch (IOException e) {
            System.out.println("Append operation failed.");
        }
    }

    // -------- READ FILE --------
    static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- FILE CONTENT ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read operation failed. File may not exist.");
        }
    }

    // -------- DELETE FILE --------
    static void deleteFile() {
        File file = new File(FILE_NAME);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Delete failed. File not found.");
        }
    }
}
