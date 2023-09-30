import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {
    public static void main(String[] args){
        try {
            FileWriter fwrite = new FileWriter("C:\\Users\\sagar\\OneDrive\\Desktop\\java\\pratice\\pro.txt");
            BufferedWriter bwrite = new BufferedWriter(fwrite);
            for(int i=1;i<10;i++){
                bwrite.write("character Stream. \n");
            }
            System.out.println("written complete");
            bwrite.close();
            fwrite.close();

            FileReader fread =new FileReader("C:\\Users\\sagar\\OneDrive\\Desktop\\java\\pratice\\pro.txt");
            BufferedReader bread = new BufferedReader(fread);
            String line;
            while ((line = bread.readLine()) != null) {
                System.out.println(line);
            }
            bread.close();
            fread.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
