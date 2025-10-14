import java.io.File;
import java.io.IOException;

public class CreateNewTextFile {
    public static void main(String[] args) {
        // Define the file deliverable
        File file = new File("output.txt");

        try {
            // Attempt to create the file as part of the I/O pipeline
            if (file.createNewFile()) {
                System.out.println("✅ File successfully created: " + file.getName());
                System.out.println("📂 File path: " + file.getAbsolutePath());
            } else {
                System.out.println("⚠️ File already exists. No new file created.");
            }
        } catch (IOException e) {
            System.out.println("❌ Exception triggered during file creation lifecycle.");
            e.printStackTrace();
        }
    }
}
