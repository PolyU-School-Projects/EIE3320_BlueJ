//WU Xiaotao 21097724D
import java.util.Scanner;

public class Square extends Shape implements Drawable
{
   private float length;
    
    public Square() {
    }
    
    public Square(float length) {
        this.length = length;
    } 
    
    public void readShape(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the length:");
        length = scanner.nextFloat();
    }
    
    public void computeArea(){
        area = (float) (length * length);
    }
    public float computeArea(float length){
        area = (float) (length * length);
        return area;
    }
    
    public void computePerimeter(){
        perimeter = length * 4;
    }
    public float computePerimeter(float length){
        perimeter = length * 4;
        return perimeter;
    }
   
    public void displayShape(){
        System.out.println("Area of Square = " + area);
        System.out.println("Perimeter of Square = " + perimeter);
    }
    
    public void draw(){
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new java.awt.Rectangle(100, 100, (int)length, (int)length));
    }
}
