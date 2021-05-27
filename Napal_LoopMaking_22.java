
package napal_loopmaking_22;

import java.util.Scanner;


public class Napal_LoopMaking_22 {

  
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a decimal number");
    int n=sc.nextInt();
    int  bina[]=new int[100];
    int i = 0;
    while(n > 0)
    {
    bina[i++] = n%2;
       n = n/2;
    }
   System.out.print("Binary number is : ");
   for(int b = i-1;b >= 0;b--)
   {
       System.out.print(bina[b]);
    }
    
}
}
