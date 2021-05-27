package napal_loopmaking_19;

import java.util.Scanner;

public class Napal_LoopMaking_19 {

    
    public static void main(String[] args) {
        // TODO code application logic here
       int Num, i;
     Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter any number to Find Factors: ");
    Num = sc.nextInt();
    
    for(i = 1; i <= Num; i++) {
      if(Num%i == 0) {
        
    System.out.format( "%d ", i);
      }
    }
    }
}
