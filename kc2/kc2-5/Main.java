
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
    X x = new Y();
    x.calculate(10,20);
    Y y = (Y) x;
    y.calculate(50,100);
    Z z = (Z) y;
    z.calculate(100,200);
    }
}

//which line will create run-time error?