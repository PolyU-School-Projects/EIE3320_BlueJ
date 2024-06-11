//WU Xiaotao 21097724D
//Week1 Hw1 Java Programming Basic-(Compulsory)

import java.util.Scanner;

public class DisplayPyramid
{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1-15 number to generate the pyramid:");
        int newInput = input.nextInt();
        //int intValue = Integer.parseInt(userInput);
        Pyramid(newInput);
        
    }
    
    public static void Pyramid(int inputNum){
        for(int i=0; i<inputNum; i++){
            for (int j=0; j<inputNum*2-1;j++){
                if (j<inputNum){
                    if ((inputNum-j)>(i+1)||(j-inputNum)>(i+1)){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(inputNum-j);
                    }
                    System.out.print("\t");
                }  
                else{
                    if ((j-inputNum)<(i)){
                       System.out.print(j-inputNum+2);  
                    }
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
        //System.out.println (inputNum);
    }
}
