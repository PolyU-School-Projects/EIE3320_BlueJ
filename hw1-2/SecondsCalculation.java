import java.util.Scanner;

public class SecondsCalculation
{
   public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int totalS = input.nextInt();
        int hours = totalS/3600;
        int seconds = totalS%60;
        int minutes = totalS/60-hours*60;
        System.out.println("hours:"+hours+" minutes:"+minutes + " seconds:"+seconds);
    }
}
