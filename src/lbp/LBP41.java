package lbp;
import java.util.Scanner;
/*
One Time Password

A company wishes to devise an order confirmation procedure. They plan to require an extra confirmation instead of simply auto-confirming the order at the time it is placed. for this purpose, the system will generate one time password to be shared with the customer. The customer who is placing the order has to enter the OTP to confirm the order. The OTP generated for the requested order ID, as the product of the digits in orderID. 

Write an algorithm to find the OTP for the OrderID.

input -----> an intger representing order id
output ----> an integer representing OTP

Ex: 1234 ===> 1*2*3*4=24

Logic:
------
sum of digits but we have to find product of digits..

 */

public class LBP41 {

	 public static void main(String[] args) {
	      Scanner obj = new Scanner(System.in);
	      int n = obj.nextInt(),d,prod=1;
	      while(n!=0){
	          d = n%10;
	          prod*= d;
	          n/=10;
	      }
	        System.out.println(prod);
	    }
}
