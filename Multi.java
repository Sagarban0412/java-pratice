interface a{
    void run1();
}
interface b{
    void run2();
}
class C implements a,b{
    public void run1(){
        System.out.println("under Interface 1");
    }
    public void run2(){
        System.out.println("under interface 2");
    }
}
public class Multi {
    public static void main(String[] args) {
        C c = new C();        
        c.run1();
        c.run2();
    }
}
