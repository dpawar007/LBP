package lbp;

import java.util.Scanner;

/*
Say "Hello" Say "Bye"

Write a function that takes a string name and number num (either 1 or 0) and return 
"Hello"+name if number is 1, 
otherwise "Bye"+name.

input ------> a string from the user
constraint -> no
output -----> a string
 */
public class LBP72 {
	  public static void main(String[] args) {
	         Scanner obj = new Scanner(System.in);
	         String s1=obj.nextLine();
	         int s2 =obj.nextInt();
	         if(s2==1)
	             System.out.println("Hello "+s1);
	         else if(s2==0)
	             System.out.println("Bye "+s1);
	    }
}
