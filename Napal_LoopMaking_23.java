/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napal_loopmaking_23;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Napal_LoopMaking_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int dec, rem,i=0;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a Dec number: ");
        dec=sc.nextInt();
        System.out.println("Oct number is : " );
        int a[] = new int[50];
        while(dec!= 0)
        {
            a[i++] = dec%8;
            dec= dec/8;
        }       
        for(int c=i-1;c>=0;c--)
        {  
	 System.out.print( a[c]);
           
        }
    }
    }

