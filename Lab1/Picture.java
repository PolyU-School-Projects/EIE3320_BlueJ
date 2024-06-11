//WU Xiaotao 21097724D
import java.util.ArrayList;

public class Picture
{
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    public void addShape(Shape s){
        shapes.add(s);
    }
    
    public void computeShape(){
        for (Shape i: shapes){
            //System.out.println("triggered"+i);
            i.computeArea();
            i.computePerimeter();
        }
    }
    
    public void listAllShapeTypes(){
        for (Shape i: shapes){
            //System.out.println("triggered"+i);
            i.displayShape();
        }
    }
    
    public void listSingleShapeType(String className){
        for (Shape i: shapes){
            if(i.getClass().getName().equals(className)){
                i.displayShape();
            }
        }
    }
}
