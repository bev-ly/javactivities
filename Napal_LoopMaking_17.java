
package napal_loopmaking_17;

import java.util.Scanner;


public class Napal_LoopMaking_17 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0, reversedInteger = 0, remainder, originalInteger;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        

        originalInteger = num;

         
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }

    
}
