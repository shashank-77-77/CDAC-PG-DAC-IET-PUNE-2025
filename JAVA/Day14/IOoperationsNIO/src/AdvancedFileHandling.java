import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class AdvancedFileHandling {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Path filePath = Paths.get("advancedData.txt");

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n============ ADVANCED FILE HANDLING MENU ============");
            System.out.println("1. Create File");
            System.out.println("2. Write Data");
            System.out.println("3. Append Data");
            System.out.println("4. Read Data");
            System.out.println("5. Delete File");
            System.out.println("6. Move/Rename File");
            System.out.println("7. File Information");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> createFile();
                case 2 -> writeFile();
                case 3 -> appendFile();
                case 4 -> readFile();
                case 5 -> deleteFile();
                case 6 -> moveFile();
                case 7 -> fileInfo();
                case 8 -> {
                    System.out.println("✅ Terminating session. Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("⚠️ Invalid selection. Please choose again.");
            }
        }
    }

    // Create File
    private static void createFile() {
        try {
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("📄 File created successfully at: " + filePath.toAbsolutePath());
            } else {
                System.out.println("⚠️ File already exists.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error creating file: " + e.getMessage());
        }
    }

    // Write Data (Overwrites existing data)
    private static void writeFile() {
        System.out.println("Enter content to write:");
        String data = scanner.nextLine();
        try {
            Files.writeString(filePath, data, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("📝 Data written successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error writing file: " + e.getMessage());
        }
    }

    // Append Data
    private static void appendFile() {
        System.out.println("Enter content to append:");
        String data = scanner.nextLine();
        try {
            Files.writeString(filePath, "\n" + data, StandardOpenOption.APPEND);
            System.out.println("📎 Data appended successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error appending to file: " + e.getMessage());
        }
    }

    // Read Data
    private static void readFile() {
        try {
            if (Files.exists(filePath)) {
                List<String> lines = Files.readAllLines(filePath);
                System.out.println("📖 File Contents:");
                for (String line : lines) {
                    System.out.println(line);
                }
            } else {
                System.out.println("⚠️ File not found.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    // Delete File
    private static void deleteFile() {
        try {
            if (Files.deleteIfExists(filePath)) {
                System.out.println("🗑️ File deleted successfully.");
            } else {
                System.out.println("⚠️ File not found.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error deleting file: " + e.getMessage());
        }
    }

    // Move or Rename File
    private static void moveFile() {
        System.out.print("Enter new file name or path: ");
        String newName = scanner.nextLine();
        Path newPath = Paths.get(newName);
        try {
            Files.move(filePath, newPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("📂 File moved/renamed successfully to: " + newPath.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("❌ Error moving/renaming file: " + e.getMessage());
        }
    }

    // File Information
    private static void fileInfo() {
        if (Files.exists(filePath)) {
            try {
                System.out.println("📘 File Details:");
                System.out.println("Name: " + filePath.getFileName());
                System.out.println("Absolute Path: " + filePath.toAbsolutePath());
                System.out.println("Size: " + Files.size(filePath) + " bytes");
                System.out.println("Readable: " + Files.isReadable(filePath));
                System.out.println("Writable: " + Files.isWritable(filePath));
                System.out.println("Last Modified: " + Files.getLastModifiedTime(filePath));
            } catch (IOException e) {
                System.out.println("❌ Error fetching file info: " + e.getMessage());
            }
        } else {
            System.out.println("⚠️ File does not exist.");
        }
    }
}
