
//Mock Q2 WU Xiaotao 21097724D
//tool: blueJ

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the start of the range:");
    int start = scanner.nextInt();
    System.out.println("Enter the end of the range:");
    int end = scanner.nextInt();
    
    //boolean isPrime = false;
    
    for (int i = start; i<=end;i++){
        boolean isPrime = true;
        for (int j = 2; j<i;j++){
            if (i%j == 0){
                isPrime = false;
            }
        }
        if (isPrime == true && i>1){
            System.out.println(i);
        }
    }
    
    
    }
}
