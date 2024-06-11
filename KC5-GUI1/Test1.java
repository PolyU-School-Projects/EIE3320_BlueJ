
/**
 * Write a description of class Test1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame
{
    //boid problem
    //should be:
    //public Test1()
   public void Test1(){
    JButton jbtOK = new JButton("OK");
    add(jbtOK);
    jbtOK.addActionListener(new Actionlistener() {
        public void actionPerformaed(ActionEvent e){
            System.out.println("The OK button is clicked");   
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new Test1();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
