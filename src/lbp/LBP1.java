package lbp;

import java.util.Scanner;

public class LBP1 {
	
/*Check the number is even or odd*/
	
	public static void main(String[] args) {
		System.out.println("enter the number to check it is even or odd");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if (n>=0) {
			if(n%2 == 0) {
				 System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else {
			System.out.println("Invalid Number");
		}

	}

}
