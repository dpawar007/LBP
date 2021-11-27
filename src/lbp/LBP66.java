package lbp;

import java.util.Scanner;

/*

Repeating Letters

Create a method that takes a string and returns a string in which each character is repeated once.

input ---------------> String from the user
constraint ----------> No
output --------------> String

abc ------> aabbcc
python ---> ppyytthhoonn
 */
public class LBP66 {
	 public static void main(String[] args) {
	      Scanner obj = new Scanner(System.in);
	      String s= obj.nextLine();
	      for (int i=0;i<s.length();i++)
	      {
	          System.out.print(s.charAt(i)+""+s.charAt(i));
	           
	      }
	    }
}
