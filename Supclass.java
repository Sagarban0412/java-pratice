class A {
  void message(){
    System.out.println("class A");
  }
}

class B extends A {
    void message(){
        System.out.println("class B");
    }
    void display() {
        message();
        super.message();
    }
}

public class Supclass {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
