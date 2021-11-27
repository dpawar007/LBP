package lbp;

import java.util.Scanner;

/*
 Sum of even Digits 

Implement a program to calculate sum of even digits present in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print sum of even digits
 */
public class LBP9 {

	public static void main(String[] args) {
	 
		Scanner obj = new Scanner(System.in);
		int d,sum=0,num = obj.nextInt();
		while(num!=0) {
			d=num%10;
			if(d%2==0)  
			  sum = sum+d;
		   num = num/10; 
		}
		System.out.println(sum);
	}

}
