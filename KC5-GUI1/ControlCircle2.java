import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class ControlCircle2 extends JFrame {
    private JButton jbtEnlarge = new JButton("Enlarge"); 
    private JButton jbtShrink = new JButton("Shrink"); 
    / CirclePanel canvas = new CirclePanel(); 
    public ControlCircle2() { 
        JPanel panel = new JPanel(); // Use the panel to group buttons 
        
        panel.add(jbtEnlarge); panel.add(jbtShrink); 
        
        this.add(canvas, BorderLayout.CENTER); // Add canvas to center 
        this.add(panel, BorderLayout.SOUTH); //Add buttons to the frame 
        
        jbtEnlarge.addActionListener(new Listener()); 
        jbtShrink.addActionListener(new Listener()); 
    }
    /** Main method */ 
    public static void main(String[] args) { 
        JFrame frame = new ControlCircle2(); 
        frame.setTitle("ControlCircle2"); 
        frame.setLocationRelativeTo(null); // Center the frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(200, 200); frame.setVisible(true); 
    } 
    class Listener implements ActionListener { 
        public void actionPerformed(ActionEvent e) { 
            System.out.println(new java.util.Date(e.getWhen())); 
            if (e.getSource() == jbtEnlarge) canvas.enlarge(); 
            else if (e.getSource() == jbtShrink) canvas.shrink(); 
        } 
    }
}