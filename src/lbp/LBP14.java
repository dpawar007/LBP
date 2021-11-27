package lbp;

import java.util.Scanner;

/* 
 Reverse Integer

Given an integer x, return x with its digits reversed. 

input---------> a number from user
constraint ---> n>=0
output -------> reverse of the given number

123 ====> 321
1234 ===> 4321
 */
public class LBP14 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int r=0,d,num = obj.nextInt();
		
		while(num!=0) {
			d =num%10;
			r = r*10+d;
			num=num/10;			
		}
		System.out.println(r);
		
		
	}

}
