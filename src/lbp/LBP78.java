package lbp;

import java.util.Scanner;

/*
Removing Duplicate Characters from a string

Given a string S, the task is to remove all the duplicates in the given string. 

input --------> a string from the user
con ----------> remove all duplicates
output -------> a string without duplicates

Ex: hello ----> helo
Ex: programming --> progamin

Logic:
------
1. read string s from the user.
2. fetch one by one char from s.
3. compare the char with remaingl all chars
4. if duplicate found, move next char to cur position
5. print updated string.

 */
public class LBP78 {
	  public static void main(String[] args) {
	         Scanner obj = new Scanner(System.in);
	         String s=obj.nextLine(),rs="";
	         for(int i=0;i<s.length();i++){
	             char c=s.charAt(i);
	             if(rs.indexOf(c)<0)
	                 rs=rs+c;
	         }
	        System.out.println(rs);
	         
	    }
}
