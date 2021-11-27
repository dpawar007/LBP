package lbp;

import java.util.Scanner;

/*
Number of Occurrences

Program to find number of occurences of the given digit in the number n

input ------> two numbers n and d
constraints-> no constraints
output -----> number of occurrences

123 3 ====> 1
122 2 ====> 2
111 1 ====> 3
123 4 ====> 0
 */
public class LBP16 {

	public static void main(String[] args) {
		 Scanner obj =new Scanner(System.in);
		 int num=obj.nextInt();
		 int key=obj.nextInt(),d,c=0;
		 while(num!=0) {
			 d =num%10;
			 if(d==key) {
				 c++;
			 }
			 num = num/10;
		 }
		 
		 System.out.println(c);
	}

}
