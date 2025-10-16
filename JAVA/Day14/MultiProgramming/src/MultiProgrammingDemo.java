import java.io.IOException;

public class MultiProgrammingDemo {
    public static void main(String[] args) {
        // Thread 1 – internal computation
        Thread computeTask = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("🧮 Compute Module running cycle " + i);
                try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        // Thread 2 – file operation simulation
        Thread ioTask = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("💾 File I/O Module active cycle " + i);
                try { Thread.sleep(600); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        // Thread 3 – system-level program execution
        Thread systemTask = new Thread(() -> {
            try {
                System.out.println("🚀 Launching external Notepad process...");
                Runtime.getRuntime().exec("notepad.exe"); // opens Notepad (Windows)
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Launch all
        computeTask.start();
        ioTask.start();
        systemTask.start();
    }
}
