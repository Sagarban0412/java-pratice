import java.util.*;
class shapes{
    void rec(int i, int j){
        System.out.println("Area of rectangle= "+i*j);
    }
    double circle(int r){
        return 3.1415*r*r;
    }
}

class Expra{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            shapes s = new shapes();

            System.out.println("Enter the length:");
            int a = sc.nextInt();
            System.out.println("Enter the breadth:");
            int b = sc.nextInt();
            s.rec(a,b);

            System.out.println("Enter the radius of circle:");
            int r=sc.nextInt();
            double c=s.circle(r);
            System.out.println(c);
        }
    }
}