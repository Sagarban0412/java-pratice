import javax.swing.*;
public class Jbutton{
    public static void main(String[] args) {
        JFrame j = new JFrame("java button example");
        JTextArea jt = new JTextArea("Hello Programmer!");
        JButton b = new JButton("Clickme!");
        j.add(b);
        b.setBounds(100,200,95,30);
        j.add(jt);
        jt.setBounds(70, 100, 150, 50);
        j.setSize(400, 400);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}