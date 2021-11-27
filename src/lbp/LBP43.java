package lbp;

import java.util.Scanner;

/*
 An e-Commerce company plans to give thier customers a discount for the newyears holiday. The discount will be calcualted on the basis of the bill amount of the order place. The discount amount is the productof the sum of all odd digits and the sum of all even digits of the customers total bill amount.

input ----> an integer bill amount, representing the total bill amount of the customer.
output ---> print an inteer representing the discount amount for the given total bill.


Logic:
------
1. read a number n from the user
2. identify all even digits and cal sum as se
3. identify all odd digits and cal sum as so
4. print se*so

 */
public class LBP43 {
	 public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       int bill = obj .nextInt(),se=0,so=0,d;
	       while(bill!=0){
	       d = bill%10;
	       if(d%2==0)
	           se+=d;
	        else
	           so+=d;
	        bill = bill/10;
	       }
	      System.out.println(se*so);
	    }
}
