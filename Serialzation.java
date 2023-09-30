import java.io.*;

class Student implements Serializable {
    String name;
    int rid;
    String contact;

    Student(String n, int r, String c) {
        this.name = n;
        this.rid = r;
        this.contact = c;
    }
}

public class Serialzation
{
    public static void main(String[] args) {
        try {
            Student si = new Student("Abhi", 104, "110044");

            // Writing the object to a serialized file
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            System.out.println("Written successfully");
            oos.close();
            fos.close();

            // Reading the serialized object from the file
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Deserialize the object and cast it back to Student
            Student readStudent = (Student) ois.readObject();
            
            System.out.println("Read successfully:");
            System.out.println("Name: " + readStudent.name);
            System.out.println("Roll ID: " + readStudent.rid);
            System.out.println("Contact: " + readStudent.contact);

            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}