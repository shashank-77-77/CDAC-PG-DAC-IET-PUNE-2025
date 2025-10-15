import java.io.*;
import java.util.Scanner;

public class FileHandlingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("data.txt"); // Default file resource
        int choice;

        while (true) {
            System.out.println("\n========= FILE HANDLING MENU =========");
            System.out.println("1. Create New File");
            System.out.println("2. Write to File");
            System.out.println("3. Read from File");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    try {
                        if (file.createNewFile()) {
                            System.out.println("✅ File created successfully: " + file.getName());
                        } else {
                            System.out.println("⚠️ File already exists: " + file.getName());
                        }
                    } catch (IOException e) {
                        System.out.println("❌ Error during file creation.");
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Enter content to write into the file:");
                        String data = scanner.nextLine();
                        FileWriter writer = new FileWriter(file);
                        writer.write(data);
                        writer.close();
                        System.out.println("📝 Data written successfully.");
                    } catch (IOException e) {
                        System.out.println("❌ Error writing to file.");
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        if (file.exists()) {
                            BufferedReader reader = new BufferedReader(new FileReader(file));
                            String line;
                            System.out.println("📖 File Contents:");
                            while ((line = reader.readLine()) != null) {
                                System.out.println(line);
                            }
                            reader.close();
                        } else {
                            System.out.println("⚠️ File not found. Create it first.");
                        }
                    } catch (IOException e) {
                        System.out.println("❌ Error reading file.");
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    if (file.delete()) {
                        System.out.println("🗑️ File deleted successfully: " + file.getName());
                    } else {
                        System.out.println("⚠️ File deletion failed or file not found.");
                    }
                    break;

                case 5:
                    System.out.println("🚪 Exiting File Handling System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("⚠️ Invalid input. Please choose between 1 and 5.");
            }
        }
    }
}
