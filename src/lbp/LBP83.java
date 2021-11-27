package lbp;

import java.util.Scanner;

/*
First N Vowels

Write a function that returns the first n vowels of a string.

input ------> a string from the user and an integer value
cons -------> Return "invalid" if the n exceeds the number of vowels in a string.
output -----> return first n vowels in the string

welcome,1 ---> eoe ----> e
welcome,2 ---> eoe ----> eo
welcome,3 ---> eoe ----> eoe
welcome,4 ---> eoe ----> invalid

 */
public class LBP83 {
	  public static void main(String[] args) {
	      Scanner obj = new Scanner(System.in);
	      String s= obj.nextLine();
	      int l=obj.nextInt();
	      s=s.replaceAll("[^aeiouAEIOU]","");
	      if(s.length()<l)  
	          System.out.println("invalid");
	      else
	          System.out.println(s.substring(0,l));
	    }
}
