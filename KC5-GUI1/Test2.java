import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame{
    public Test2(){
    JButton jbtOK = new JButton("OK");
    JButton jbtCancel = new JButton("Cancel");
    getContentPane().add(jbtOK);
    getContentPane().add(jbtCancel);
    //problem with line 11 and 12
    jbtOK.addActionListener(this);
    jbtCancel.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("A button is clicked");
    }

    public static void main(String[] args) {
        JFrame frame = new Test2();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}