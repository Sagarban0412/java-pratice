import java.io.*;
public class Read {
        public static void main(String[] args) {
            try {
                FileReader reader = new FileReader("C:\\Users\\sagar\\OneDrive\\Desktop\\java\\pratice\\read.txt");
                BufferedReader buffer = new BufferedReader(reader);
                String line = buffer.readLine();
                if(line!=null){
                    System.out.println(line);
                }else{
                    System.out.println("No contents to display");
                }
                reader.close();
                buffer.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
