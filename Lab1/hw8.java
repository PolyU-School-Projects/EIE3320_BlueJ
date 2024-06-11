//WU XiaoTao 21097724D
//BlueJ

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hw8 
{
    private JFrame frame;
    float area;
    float perimeter;
    
    JLabel jlblShape = new JLabel("Choose shape: 's', 'r' or 'c' ");
    JTextField jtfShape = new JTextField(""); 
    JLabel jlblRadius = new JLabel("Input radius of circle");
    JTextField jtfRadius = new JTextField("");
    JLabel jlblLength = new JLabel("Input length of square or rectangle");
    JTextField jtfLength = new JTextField("");
    JLabel jlblWidth = new JLabel("Input width of rectangle");
    JTextField jtfWidth = new JTextField("");
    JLabel jlblArea = new JLabel("Area:");
    JTextField jtfArea = new JTextField("");
    JLabel jlblPerimeter = new JLabel("Perimeter");
    JTextField jtfPerimeter = new JTextField("");
    static JButton jbtCalculate = new JButton("Get Results");
    
    public hw8() {
        frame = new JFrame("Display");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));
        panel.add(jlblShape);
        panel.add(jtfShape);
        panel.add(jlblRadius);
        panel.add(jtfRadius);
        panel.add(jlblLength);
        panel.add(jtfLength);
        panel.add(jlblWidth);
        panel.add(jtfWidth);
        panel.add(jlblArea);
        panel.add(jtfArea);
        panel.add(jlblPerimeter);
        panel.add(jtfPerimeter);
        panel.add(jbtCalculate);

        frame.add(panel);
        frame.setVisible(true);
    }
    public void calculation() {
    String input = jtfShape.getText().trim().toLowerCase();

    if (input.equals("c")) {
        Circle circle = new Circle();
        float radius = Float.parseFloat(jtfRadius.getText());
        area =  circle.computeArea(radius);
        perimeter = circle.computePerimeter(radius);
        
    } else if (input.equals("s")) {
        Square square = new Square();
        float length = Float.parseFloat(jtfLength.getText());
        area =  square.computeArea(length);
        perimeter = square.computePerimeter(length);
        
    } else if (input.equals("r")) {
        Rectangle rectangle = new Rectangle();
        float length = Float.parseFloat(jtfLength.getText());
        float width = Float.parseFloat(jtfWidth.getText());
        area =  rectangle.computeArea(length,width);
        perimeter = rectangle.computePerimeter(length,width);
    } else {
        // Invalid input
        jtfArea.setText("");
        jtfPerimeter.setText("");
    }
    jtfArea.setText(Float.toString(area));
    jtfPerimeter.setText(Float.toString(perimeter));
}
    
    public static void main(String[] args){
        hw8 displayPanel = new hw8();
        jbtCalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            displayPanel.calculation();
            }
        });
       
        }
    }
     

