import java.util.Map;
import java.util.HashMap;

public class Mapinterface{
    public static void main(String[] args) {
        Map<String,String> hash = new HashMap<String,String>();

        hash.put("123", "sagar");
        hash.put("13", "sajan");
        System.out.println("value at 123"+hash.get(123));
        System.out.println("value at 5"+hash.get(5));
    }
}