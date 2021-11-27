package lbp;

import java.util.Scanner;

/*
 Lucky Customer

An e-commerce website wishes to find the lucky customer who will be eligible for full value cash back. 
For this purpose,a number N is fed to the system. 
It will return another number that is calculated by an algorithm. 
In the algorithm, a seuence is generated, in which each number n the sum of the preceding number. initially the sequence will have two 1's in it. 
The System will return the Nth number from the generated sequence which is treated as the order ID. The lucky customer will be one who has placed that order. Write an alorithm to help the website find the lucky customer.

input --------> a number
constraint ---> n>0
output -------> a number


1,1,2,3,5,8,13,21...
1 2 3 4 5 6 7  8.....
   
[0, 1, 2, 3, 4, 5, 6,  7,  8, 9 ]
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 
Ex: n=4 ---> 3
Ex: n=7 ---> 13

 */
public class LBP20 {

	static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		System.out.println(fibo(num));

	}

}
