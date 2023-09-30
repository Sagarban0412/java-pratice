import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\sagar\\OneDrive\\Desktop\\java\\pratice\\Byte.txt");
            int content=00000100;
            fout.write(content);
            System.out.println("written Sucessfully");
            fout.close();

            FileInputStream fin = new FileInputStream("C:\\Users\\sagar\\OneDrive\\Desktop\\java\\pratice\\Byte.txt");
            int data=fin.read();
            System.out.println(data);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
