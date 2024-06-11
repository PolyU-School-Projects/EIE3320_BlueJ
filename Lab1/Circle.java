//WU Xiaotao 21097724D
//one-person group
import java.util.Scanner;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape implements Drawable
{
    private float radius;
    
    public Circle() {
    }
    
    public Circle(float radius) {
        this.radius = radius;
    } 
    
    public void readShape(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the radius:");
        radius = scanner.nextFloat();
    }
    
    public void computeArea(){
        area = (float) (radius * radius * Math.PI);
    }
    public float computeArea(float radius) {
        area = (float) (radius * radius * Math.PI);
        return area;
    }
    
    public void computePerimeter(){
        perimeter =  (float) (2 * radius * Math.PI);
    }
    public float computePerimeter(float radius) {
        perimeter = (float) (2 * radius * Math.PI);
        return perimeter;
    }
   
    public void displayShape(){
        System.out.println("Area of circle = " + area);
        System.out.println("Perimeter of circle = "+ perimeter);
    }
    
    public void draw(){
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Ellipse2D.Double(0, 0, radius * 2, radius * 2));
    }
}
