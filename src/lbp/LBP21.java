package lbp;

import java.util.Scanner;

public class LBP21 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		 Scanner obj = new Scanner(System.in);
		 int d,s=0,n=obj.nextInt();

		 while(n!=0) {
			 d= n%10;
			 if(d==2||d==3||d==5||d==7) {
				 s=s+d; 
			 }
			 n=n/10;
		 }
		 System.out.println(s);
	}

}
