
package napal_loopmaking_18;

import java.util.Scanner;


public class Napal_LoopMaking_18 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 0, exponent = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Base: ");
        base = sc.nextInt();
        System.out.println("Input Exponent");
        exponent = sc.nextInt();
        
        long result = 1;

        for (int i = 1; i<=exponent;i++)
        {
            result *= base;
        }

        System.out.println( "Answer: " + base + "^" + exponent + "=" + result);
    }
}
    
    

