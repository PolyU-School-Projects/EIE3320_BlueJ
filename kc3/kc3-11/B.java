public class B extends A
{
    public B(int i, int j){
        super(i*j);
        System.out.print(myMethod(i,j));
    }
    int myMethod(int i, int j){
        return myMethod(i*j);
    }
}