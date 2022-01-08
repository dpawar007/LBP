package lbp;

import java.util.Scanner;

/*
Replace Letters With Position In Alphabet

Create a function that takes a string and replaces each letter with its appropriate position in the alphabet. "a" is 1, "b" is 2, "c" is 3, etc, etc.

Note: If any character in the string isn't a letter, ignore it.

input -----------> a string from the user
constriant ------> non-empty string
output ----------> position of characters seperated by space
 
 */
public class LBP91 {
	 public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       String s = obj.nextLine().toLowerCase();        
	       for(int i=0;i<s.length();i++){
	           if(s.charAt(i)>='a' && s.charAt(i)<='z')
	            System.out.print((int)s.charAt(i)-96+" ");
	       }
	    }
}
