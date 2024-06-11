//WU Xiaotao 21097724D
import java.util.Scanner;

public class ShapeTester
{
    public static String inputType;
    
    public static void main(String[] args){
        
        while (true) {
            System.out.println("***************************************");
            System.out.println("*Please choose one of the followings: *");
            System.out.println("*Press 'c' - Circle                   *");
            System.out.println("*Press 's' - Square                   *");
            System.out.println("*Press 'r' - Rectangle                *");
            System.out.println("*Press 'x' - EXIT                     *");
            System.out.println("***************************************");
        
            Scanner scanner = new Scanner(System.in);
            inputType = scanner.next();
            if (inputType.equals("c")){
                Circle circle = new Circle();
                circle.readShape();
                circle.computeArea();
                circle.computePerimeter();
                circle.displayShape();
                System.out.println("");
                circle.draw();
            }
            else if (inputType.equals("s")){
                Square square = new Square();
                square.readShape();
                square.computeArea();
                square.computePerimeter();
                square.displayShape();
                System.out.println("");
                square.draw();
            }
            else if (inputType.equals("r")){
                Rectangle rectangle = new Rectangle();
                rectangle.readShape();
                rectangle.computeArea();
                rectangle.computePerimeter();
                rectangle.displayShape();
                System.out.println("");
                rectangle.draw();
            }
            else if (inputType.equals("x")) {
                break;
            }
            else{
                System.out.println("Invalid command");
                System.out.println("");
            }
        }
    }
}
