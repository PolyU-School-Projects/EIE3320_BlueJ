
/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class A
{
    abstract void firstMethod();
    
    void secondMethod(){
        System.out.print("A");
        firstMethod();
    }
}
