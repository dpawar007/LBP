package lbp;

import java.util.Scanner;

/*
parentheses balance

Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
Formally, a parentheses string is valid if and only if:
It is the empty string, or It can be written as AB (A concatenated with B), where A and B are
valid strings, or It can be written as (A), where A is a valid string. Given a parentheses
string, return the minimum number of parentheses we must add to make the resulting string valid.

input --------> a string from the user
con ----------> no
output -------> number of parentheses to be added

() -----> 0
()( ----> 1
()()()--> 0
((( ----> 3

1. read a string s from the user.
2. if char is ( then increment counter.
3. if char is ) then decrement counter
4. print the value of counter
 */
public class LBP87 {
	   public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       String s = obj.nextLine();
	       int rp=0,lp=0;
	       for(int i=0;i<s.length();i++){
	           if(s.charAt(i)=='(') lp++;
	           else if(s.charAt(i)==')') rp++;
	       }
	        System.out.println(lp-rp);
	    }
}
