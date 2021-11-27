package lbp;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

/*To check whether the given year is leap year or not.*/

/*logic:

(year%4==0 && year%100!=0) or (year%400==0)
     condition1              condition2
*/

public class LBP3 {

	static void isLeap(int year) {		 
		if ((year%4 == 0 && year%100!=0) || year%400==0)
			System.out.println("true");
		else 
			System.out.println("false");		
		}
	public static void main(String[] args) {
		/*System.out.println("Enter the year to Check it is leap year or not");
		Scanner sc =new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		if ((year%4 == 0 && year%100!=0) || year%400==0)
			System.out.println("True");
		else 
			System.out.println("Flase");
*/
		System.out.println("Enter the year to check");
		 Scanner sc = new Scanner(System.in);
		 int year=sc.nextInt() ;
		 isLeap(year);
	}

}
