import java.util.TreeSet;
public class Ary {
    public static void main(String[] args) {
        TreeSet<String> ary = new TreeSet<String>();
        System.out.println("size of array"+ary.size());
        ary.add("raman");
        ary.add("anil");
        ary.add("hari");
        System.out.println("array:"+ary);
        ary.remove("raman");
        System.out.println("After removing:" +ary);
        System.out.println("After removing size is:" +ary.size());
        System.out.println("list contain india or not:"+ary.contains("india"));
        System.out.println("list contain raman or not:"+ary.contains("anil"));
    }
}
