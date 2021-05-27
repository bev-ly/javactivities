
package napal_loopmaking_24;
import java.util.Scanner;



public class Napal_LoopMaking_24 {

    
    public static void main(String[] args) {
       
        int rem,num;
        String str2 = "";
        Scanner Sc=new Scanner(System.in);
        
        System.out.println("Enter Decimal : ");
        num = Sc.nextInt();
        
       char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num>0)
        {
        rem=num%16;
        str2=hex[rem]+str2;
        num=num/16;
        }
        System.out.println("Hexadecimal VALUE " + str2);
  }
    }
    

