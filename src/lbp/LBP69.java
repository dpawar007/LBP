package lbp;

import java.util.Scanner;

/*
LBP69

Remove Every vowel from a String

Create a function that takes a string and returns a new string with all vowels removed. 

input -------------> a string 
constraints -------> No
output ------------> a string

welcome ------> wlcm
 */
public class LBP69 {
	  public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);       
	       System.out.println(obj.nextLine().replaceAll("[aeiou]",""));
	    }
}
