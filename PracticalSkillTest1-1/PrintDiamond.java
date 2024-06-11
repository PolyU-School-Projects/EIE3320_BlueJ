
//Q1 WU Xiaotao 21097724D
//tool: BlueJ

import java.util.Scanner;

public class PrintDiamond
{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the edge size of diamond:");
        int newInput = input.nextInt();
        Diamond(newInput);
        
    }
    
    public static void Diamond(int inputNum){
        for (int i = 0; i<inputNum+1; i++){
            for (int j = 0; j<i; j++){
                while ((inputNum-j)>(i)){
                    System.out.print(" ");
                    j++;
                }
                for (int k = 1; k<2*i; k++){
                    System.out.print(k);
                    }
                System.out.print("\n");
                break;   
            }
        }
        for (int i = inputNum-1; i>=1; i--){
            for (int j = 1; j<=inputNum-i; j++){
                
                    System.out.print(" ");
                    
                }
                for (int k = 1; k<=2*i-1; k++){
                    System.out.print(k);
                    }
                System.out.print("\n");
                   
            
        }
    }
    
}
