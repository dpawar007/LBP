package lbp;

import java.util.Scanner;

public class LBP6 {
/* Free Coffee Cups
 
   For each of the 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. 
   Implement a program that takes n cups bought and print as an integer the total number of cups I would get.

input -------------> n number of cups from user
constraints -------> n>0
output ------------> number of cups present have

  
 */
	public static void main(String[] args) {
	 
		System.out.println("Enter the cups you want to get");
		Scanner obj =new Scanner(System.in);
	    int cups = obj.nextInt();
	    System.out.println(cups+(cups/6));
	    
	    
		
		
	}

}
