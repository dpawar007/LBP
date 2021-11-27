package lbp;

import java.util.Scanner;
/*
 
Sum of prime Digits 

Implement a program to calculate sum of prime digits present in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print sum of prime digits

prime digits: ---> below 10 ---> 0-9 ===> 2,3,5,7

  */
public class LBP11 {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int d,sum=0, num = obj.nextInt();
	
	while(num!=0) {
		d = num%10;
		if(d==2 || d==3 || d==5 || d==7 ) {
			sum = sum + d;
		}
		num = num/10;
	 }
	System.out.println(sum);
  }
	
}
