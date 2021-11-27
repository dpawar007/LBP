package lbp;

import java.util.Scanner;

/*
Valid Hex Code

Create a function that determines whether a string is a valid hex code.
A hex code must begin with a pound key # and is exactly 6 characters in length. 
Each character must be a digit from 0-9 or an alphabetic character from A-F.
All alphabetic characters may be uppercase or lowercase.

input -----> a string from the user
con -------> no
output ----> true or false
 */
public class LBP80 {
	  public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s=obj.nextLine().toUpperCase();
	        int counter=0;
	        if(s.startsWith("#") && s.length()==7){ 
	             for(int i=1;i<s.length();i++){
	                 if((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='A' && s.charAt(i)<='F'))
	                   counter++;
	             }            
	        }
	        System.out.println(counter==6);
	    }
}
