package lbp;

import java.util.Scanner;

public class LBP5 {

/*	Retrun the next Number from the Integer Passed
 * 
 *  
 *  
 */
	public static void main(String[] args) {
		System.out.println("Enter the number to increment");		
		Scanner obj = new Scanner(System.in);
		int no = obj.nextInt();
		System.out.println("You enter number  : "+no);
	    System.out.println("You enter number Pre-incrment  : "+ ++no);
       //System.out.println("Incrmented Number Post-Increment : "+ no++);

	}

}
