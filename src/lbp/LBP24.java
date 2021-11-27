package lbp;

import java.util.Scanner;

/*
Sum of even numbers

Implement a program to find sum of even number between x and y both are inclusive.

input -----> two int values
constraint-> no
output ----> sum of even numbers between x and y
 */
public class LBP24 {

	private static Scanner obj;

	public static void main(String[] args) {
				System.out.println("Enter start and end number");
		        obj = new Scanner(System.in);
		        int x=obj.nextInt();
		        int y=obj.nextInt(),i,s=0;
		        for(i=x;i<=y;i++){
		            if(i%2==0)
		                s=s+i;
		        }
		        System.out.println(s);
		    }
	       
}
