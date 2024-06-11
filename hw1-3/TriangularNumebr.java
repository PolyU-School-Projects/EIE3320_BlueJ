

public class TriangularNumebr{
    
    public static void main(String[] args){
        
        getTriangularNumber();
        
    }
    public static void getTriangularNumber(){
        int[] triList = new int[100];
        int record = 0;
        int count = 0;
        for (int i=0; i<100; i++){
            record = record +i+1;
            triList[i] = record;
        }
        System.out.println("The first 100 triangular numbers are :");
        for (int number : triList) {
            
            System.out.print(number+" ");
            count++;
            if (count == 10){
            System.out.print("\n");
            count = 0;
        }
        }
        
    }
    
}
