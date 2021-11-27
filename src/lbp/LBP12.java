package lbp;

import java.util.Scanner;

/*
Sum of Digits divisible by 3

Implement a program to calculate sum of digits that are divisible by 3 in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print sum of digits that are divisible by 3

 */
public class LBP12 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int d,sum =0,num =obj.nextInt();
		
		d = num%10;
		if(d%3==0) 
			sum = sum+d;
		 num = num/10;
		 
		System.out.println(sum); 		
	}

}
