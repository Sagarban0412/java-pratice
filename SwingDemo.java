import javax.swing.*;
import java.awt.event.*;

public class SwingDemo extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("SwingDemo");

        JLabel l1 = new JLabel("Enter the First number:");
        l1.setBounds(50, 20, 200, 20);
        jFrame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(50, 40, 120, 20);
        jFrame.add(t1);

        JLabel l2 = new JLabel("Enter the Second number:");
        l2.setBounds(50, 70, 200, 20);
        jFrame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 90, 120, 20);
        jFrame.add(t2);

        JButton b1 = new JButton("Click me!");
        b1.setBounds(50, 120, 100, 30);
        jFrame.add(b1);

        JTextField t3= new JTextField();
        t3.setBounds(50, 150, 120, 20);
        jFrame.add(t3);

        jFrame.setSize(400, 300);
        jFrame.setLayout(null); // Set layout manager to null for absolute positioning
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c= a+b;

                t3.setText(Integer.toString(c));

            }
        });
        
    }
}
