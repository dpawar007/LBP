package lbp;

import java.util.Scanner;

public class LBP7 {
/*  Extract Digits from the number

Implement a program to extract digits from the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print digits in line sep by space
 */
	public static void main(String[] args) {
	
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int nu = obj.nextInt(),d;
		while(nu!=0) {
			 d = nu%10;
			 System.out.print(d+" ");
			 nu = nu / 10;			 
		}
		
		String s = "dipak ios good boy";
		 
 	}

}
