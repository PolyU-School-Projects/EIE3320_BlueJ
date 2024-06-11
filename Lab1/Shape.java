//WU Xiaotao 21097724D

public abstract class Shape implements Drawable
{
    protected float area;
    protected float perimeter;
    
    abstract public void readShape();
    abstract public void computeArea();
    abstract public void computePerimeter();
    abstract public void displayShape();
}
