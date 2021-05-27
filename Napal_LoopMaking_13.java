
package napal_loopmaking_13;

import java.util.Scanner;


public class Napal_LoopMaking_13 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int a;
        int b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        num =  sc.nextInt();
        
        a = num;
        while(a >= 10){
            a = a / 10;
        }
        b = num % 10;
        int sum = a + b;
        System.out.println("\nThe first Digit of a given Number: " + num + " = " + a);
        System.out.println("\nThe las digit of a given Number: " + num + " = " + b);
        System.out.println("\nThe sum of first digit and second digit is: " + sum);
    }
    
}
