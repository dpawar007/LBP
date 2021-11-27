package lbp;

import java.util.Scanner;

public class LBP10 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int d,sum=0,num = obj.nextInt();
		while(num!=0) {
			d=num%10;
			if(d%2!=0)  
			  sum = sum+d;
		   num = num/10; 
		}
		System.out.println(sum);

	}

}
