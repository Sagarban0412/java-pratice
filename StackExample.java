import java.util.*;
import java.util.Scanner;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=1;i<10;i++){
             st.push(i);
        }
        System.out.println("After insertion");
        System.out.println(st);
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter data to be delete");
            int a= sc.nextInt();
            for(int j=1;j<a;j++){
            st.pop();
   }
        }
        System.out.println("After deletion");
    System.out.println(st);

    try (//searching data.................
    Scanner s = new Scanner(System.in)) {
        System.out.println("Enter data to be Search");
        int b= s.nextInt();
        

        if(st.empty()){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("stack is not empty");
            System.out.println("stack peek:" +st.peek());
            System.out.println("search: " +st.search(b));

            
        }
    }

    }
}
