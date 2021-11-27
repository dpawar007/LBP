package lbp;

import java.util.Scanner;

/*
War of Numbers

There is a great war between the even and odd numbers. Many numbers already lost thier life in this war and its your task to end this. You have to determine which group sums larger. the even, or the odd, the larger group wins.

Create a function that takes an array of integers , sums the even and odd numbers seperately, then return the difference between sum of even and odd numbers.

input --------> number and array elements
constraint ---> no
output -------> difference between sum of even and odd numbers

Logic:
------
1. we have to read array size n.
2. read n values and store in a[].
3. sum of even numbers and sum of odd numbers.
4. print diff between se-so

 */
public class LBP44 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt(),se=0,so=0,diff=0;
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]%2==0)
				se+=a[i];
			else
				so+=a[i];
		}
		diff=so-se;
		System.out.println((diff<0)?-diff:diff);
	}
}
