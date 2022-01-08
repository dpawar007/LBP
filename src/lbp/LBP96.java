package lbp;

import java.util.Scanner;

/*
Number of vowels

Implement a program to return number of vowels present in the given string

input ---------> a string from the user
con -----------> non-empty string
output --------> return number of vowels
 */
public class LBP96 {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s=obj.nextLine();
	        int c=0;
	        for(int i=0;i<s.length();i++){
	            char ch = s.charAt(i);
	            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ){
	                c++;
	            }
	        }
	        System.out.println(c);
	    }
	
}
