
/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
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
