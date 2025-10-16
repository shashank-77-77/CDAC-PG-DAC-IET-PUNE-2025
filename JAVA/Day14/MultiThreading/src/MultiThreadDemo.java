class DataProcessor extends Thread {
    private String taskName;

    public DataProcessor(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - processing step " + i);
            try {
                Thread.sleep(500); // simulate workload
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(taskName + " ✅ Completed");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        DataProcessor t1 = new DataProcessor("Thread-A");
        DataProcessor t2 = new DataProcessor("Thread-B");
        DataProcessor t3 = new DataProcessor("Thread-C");

        t1.start();
        t2.start();
        t3.start();
    }
}
