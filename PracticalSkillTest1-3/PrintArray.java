//Q3. WU Xiaotao 21097724D
//Tool: BlueJ

import java.util.Scanner;
public class PrintArray{  
    static void reversePrint(int[] arr){
        int[] reverse = new int[arr.length];
        for (int i = 0; i<arr.length; i++){
            reverse[i] = arr[arr.length-i-1];
        }
        System.out.print("The array inputted is printed reversely:");
        for (int i = 0; i<reverse.length; i++){
            System.out.print(reverse[i]+" ");
        }
        System.out.println();
    }
    static void printUnique(int[] arr){
        System.out.print("The distinct elements of the array inputted are:");
        for (int i = 0; i<arr.length; i++){
            boolean isUnique = true;
            for (int j = 0; j<i;j++){
                if (arr[i] == arr[j]){
                    isUnique = false;
                }
                
            }
            if (isUnique){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        
        

    }
 
    public static void main (String[] args) {  
        System.out.print("Please enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Please enter each element of array separated by a space: ");
        int arr[];
        arr= new int[a];        
        for (int i=0; i<a; i++)  {
            arr[i] = scanner.nextInt();
        }
        reversePrint(arr);  
        printUnique(arr);
    }  
} 