
package napal_loopmaking_16;
import java.util.Scanner;

public class Napal_LoopMaking_16 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        int reversenum = 0;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a Number");
       num = in.nextInt();
       
         
         while(num!= 0){
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
            
            
         }
          System.out.println("\nThe reverse of the Number that you enter is: " + reversenum);
    }
       
}
