package lbp;

import java.util.Scanner;
/*
Celsius to Fahrenheit

Create a function/method to convert celsius to fahrenheit.

input ------> celsius
constrint --> no
output -----> Fahrenheit

forl:- fer = (cel*9/5)+32
 */
public class LBP25 {

	public static void main(String[] args) {
		    Scanner obj = new Scanner(System.in);
	        int cel = obj.nextInt();
	        System.out.println((cel*9/5)+32);
	        obj.close();
	}

}
