
/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A
{
    public A(int i){
    System.out.print(1);
    }
    public A(){
        this(10);
    System.out.print(2);
    }
    void A(){
    A(10);
    System.out.print(3);
    }
    void A(int i){
    System.out.print(4);
    }
}
