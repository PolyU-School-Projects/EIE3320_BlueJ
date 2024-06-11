import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test3 extends JFrame implements ActionListener {
    public Test3(){
    JButton jbtOK = new JButton("OK");
    getContentPane().add(jbtOK);
    }
    
    //is not executed
    public void actionPerformed(ActionEvent e) {
        System.out.println("A button is clicked");
    }

    public static void main(String[] args) {
        JFrame frame = new Test3();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}