
//Mock Q1 WU Xiaotao 21097724D
//tool: blueJ

import java.util.Arrays;
import java.util.Random;

public class LuckyDrawGenerator
{
    public static void main(String[] args){
    int[] luckyNumbers = generateLuckyDrawNumbers();
    Arrays.sort(luckyNumbers);
    System.out.println("Lucky Draw Numebrs: "+ Arrays.toString(luckyNumbers));
    }
    
    public static int[] generateLuckyDrawNumbers(){
    int[] numbers = new int[6];
    Random random = new Random();
    for (int i = 0; i<6; i++){
        //boolean euql = true;
        numbers[i] = random.nextInt(49)+1;
        for (int j =0; j<i;j++){
        while (numbers[j] == numbers[i]) {
            //euql = false;
            numbers[i] = random.nextInt(49)+1;
        } 
        }
    }
    
    return numbers;
    }
    
}
