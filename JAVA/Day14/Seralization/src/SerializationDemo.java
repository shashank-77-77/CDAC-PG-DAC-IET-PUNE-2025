import java.io.*;

// Serializable class (data entity)
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: ₹" + salary);
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Shashank", 101, 85000.0);

        // Serialization phase
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(emp);
            System.out.println("✅ Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization phase
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee restored = (Employee) in.readObject();
            System.out.println("✅ Object deserialized successfully.");
            restored.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
