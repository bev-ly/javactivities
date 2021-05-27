
package napal_loopmaking_4;

import java.util.Scanner;


public class Napal_LoopMaking_4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        int num = 0,aver = 0;
        System.out.print(" number 1:");
        int j = sc.nextInt();
        System.out.print(" number 2:");
        int i = sc.nextInt();
        System.out.print(" number 3:");
        int h = sc.nextInt();
        System.out.print(" number 4:");
        int g = sc.nextInt();
        System.out.print(" number 5:");
        int f = sc.nextInt();
        System.out.print(" number 6:");
        int e = sc.nextInt();
        System.out.print(" number 7:");
        int d = sc.nextInt();
        System.out.print(" number 8:");
        int c = sc.nextInt();
        System.out.print(" number 9:");
        int b = sc.nextInt();
        System.out.print(" number 10:");
        int a = sc.nextInt();
        
        int sum = j + i + h + g + f + e + d + c + b + a;
        double average = sum/10.0;
            
       
        System.out.println("The sum of 10 number is: " + sum); 
        System.out.println(" The average is: " + average);
    }
    
}
