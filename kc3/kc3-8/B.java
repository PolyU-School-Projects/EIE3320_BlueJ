abstract class B extends A
{
    abstract void thirdMethod();
    
    void firstMethod(){
        System.out.print("B");
        thirdMethod();
    }
}
