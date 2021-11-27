package lbp;

import java.util.Scanner;

/*
Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

input ----------> a number
constraint -----> prime number
output ---------> prime number

10 ----> 10,11 ----> 11
11 ----> 11 -------> 11
12 ----> 12,13 ----> 13
13 ----> 13 -------> 13
14 ----> 14,15,16,17 --> 17

Logic:
------
1. read n value from the user.
2. run a loop from n to infinate
3. check isPrime(i) if it is true return and stop the loop.

 */
public class LBP49 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt(),i;
		for(i=n;;i++) {			
			if(isPrime(i)) {
				System.out.println(i);
				break;
			}
		}
		
	}

	private static boolean isPrime(int n) {
		int counter=0;
		for(int i=1 ;i<=n;i++) {
			if(n%i==0)
				counter++;
		}
		return counter==2;
	}
}
