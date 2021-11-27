package lbp;

import java.util.Arrays;
import java.util.Scanner;

/*

Is the String in Order?

Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.

input -------> a string from the user
cons --------> for non-empty string print invalid
output ------> true or false

1. copy original string to temp string.
2. sort the orginal string
3. compare original string and temp string.

 */
public class LBP84 {
	   public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       String s=obj.nextLine(),temp;
	       temp=s;
	       char c[]=s.toCharArray();
	       Arrays.sort(c);
	       System.out.println(new String(c).equals(temp));
	        
	    }
}
