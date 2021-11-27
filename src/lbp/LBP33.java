package lbp;

import java.util.Scanner;

/*
An e-commerce company plans to give their customers a discount for the newyears holiday. The discount will be calcualted on the basis of the bill amount of the order placed. The discount amount is the sum of all the odd digits in the customers total bill amount. if no odd digits is present in the bill amount, then discount will be zero.

input ---------> the input consists of an integer bill amount, representing the customers total bill amount.
output -------> print an integer representing the dicount for the given total bill amount.
constraint ---> n>0

Logic:
------
sum of odd digits.
 */
public class LBP33 {

	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        int n=obj.nextInt(),d,s=0;
	        while(n!=0){
	            d=n%10;
	            if(d%2!=0)  s=s+d;
	            n=n/10;
	        }
	        System.out.println(s);
	    }
}
