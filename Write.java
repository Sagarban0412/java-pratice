import java.io.BufferedWriter;
import java.io.FileWriter;

class Write{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\sagar\\OneDrive\\Desktop\\java\\pratice\\read.txt");
            BufferedWriter bwrite = new BufferedWriter(writer);
            writer.write("hello programmer.");
            writer.write("How are you?");
            System.out.println("Written sucessfully");
            bwrite.close();
            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}