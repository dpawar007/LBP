package lbp;

import java.util.Scanner;

/*
Fahrenheit to Celsius

Program to convert fahrenheit to celsius.

input -------> fahrenheit
constraint --> no
output ------> celsius

forl:- cel = (fer-32)*5/9
 */
public class LBP26 {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	        int fer = obj.nextInt();
	        System.out.println((int)(fer-32)*5/9);
	        obj.close();
	}

}
