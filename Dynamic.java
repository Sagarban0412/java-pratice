class A{
    void run(){
        System.out.println("under class a");
    }
}
class B extends A{
    void run(){
        System.out.println("under class b");
    }
}
class C extends A{
    void run(){
        System.out.println("unde class C");
    }
}

public class Dynamic {
    public static void main(String[] args) 
    {
        A b = new B();    
        b.run();
   }
}
