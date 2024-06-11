//WU Xiaotao 21097724D
import java.util.Scanner;

public class Rectangle extends Shape implements Drawable
{
    private float length;
    private float width;
    
    public Rectangle() {
    }
    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    } 
    
    public void readShape(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the length:");
        length = scanner.nextFloat();
        System.out.print("Please input the width:");
        width = scanner.nextFloat();
    }
    
    public void computeArea(){
        area =  (float)(length * width) ;
    }
    public float computeArea(float length, float width){
        area =  (float)(length * width) ;
        return area;
    }
    
    public void computePerimeter(){
        perimeter =  2*(length + width);
    }
    public float computePerimeter(float length, float width){
        perimeter =  2*(length + width);
        return perimeter;
    }
   
    public void displayShape(){
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = "+ perimeter);
    }
    
    public void draw(){
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new java.awt.Rectangle(200, 200, (int)length, (int)width));
    }
}
