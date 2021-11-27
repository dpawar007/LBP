package lbp;

import java.util.Scanner;

/*
Paliandrome Number

Program to check whether the given number is paliandrome or not

input -----> a number from the user
constraint-> n>0
output ----> Yes or No

123 , 321 ------> No
121 , 121 ------> Yes
111 , 111 ------> Yes
 */
public class LBP17 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int r=0,d,temp,num = obj.nextInt();
	    temp = num;
		while(num!=0) {
			d =num%10;
			r = r*10+d;
			num=num/10;			
		}
		System.out.println(temp==r?"yes":"no");
	}

}
