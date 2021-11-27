package lbp;

import java.util.Scanner;

/*Sum of Digits 
 Implement a program to calculate sum of digits present in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print sum of digits
   
Logic:
~~~~~~
1. read num from the user
2. extract digits one by one
3. add those digits to a sum variable
4. print sum variable

 */
public class LBP8 {

	public static void main(String[] args) {
		 
		Scanner obj = new Scanner(System.in);
		int d,sum=0,num = obj.nextInt();
		while(num!=0) {
			d= num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.println(sum);
	}
}
