package lbp;

import java.util.Scanner;

import java.util.Scanner;

/*
A Special two digit number

A special two digit number is a number such that when the sum of its digits is added to the product of its digits, the result should be equal to the original two-digit number.

Implement a program to accept a two digit number and check whether it is a special two digit number or not.

input -----> a two digit number
constraint-> 10<=n<=99
output ----> special two digit number or not
 */
public class LBP23 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
	    int d, s=0,p,t,num=obj.nextInt();
	    p=1;
	    t=num;
	    while(num!=0) {
	    	d=  num%10;
	    	s+=d;
	    	p*=d;
	    	num=num/10;
	    }
	    System.out.println(t==(s+p)?"Yes":"No");
	    obj.close();
	}

}
