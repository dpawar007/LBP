package lbp;

import java.util.Scanner;

public class LBP29_1 {
	
	static String isPrime() {
		System.out.println("Call to isPrime");
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= 200; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
 			    primeNumbers = primeNumbers + i +" ";
				
			}
		}
		
		 
 		return primeNumbers ;
		
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = obj.nextInt();
		String p =isPrime();
		System.out.println(p);
		String[] pn = new String[p.length()];
		pn=p.split(" ");
		System.out.println("Prime Numbers : "+pn[17-1]);
 		 
  	}
}