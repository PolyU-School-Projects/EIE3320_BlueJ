
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    static void overloadedMethod(A a){
    System.out.println("ONE");
    }
    static void overloadedMethod(B b){
    System.out.println("TWO");
    }
    static void overloadedMethod(Object obj){
    System.out.println("THREE");
    }
    
    public static void main(String[] args){
    C c = new C();
    overloadedMethod(c);
    }
}
