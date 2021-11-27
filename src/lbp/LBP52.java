package lbp;

import java.util.Scanner;

/*
Jewels and Stones

You are given Strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have you want to know how many of the stones you have are also jewels.

Letter are case sensitive. so "a" is considered as a different type of stone from "A".

input ------> A string
constriant -> no
output -----> how many of the stones

Eg:
J="aA"
S="aAAbbbb"

1+2=3

Logic:

1. read J and S from the user.
2. read every char from J and check whether it is in s or not.
3. if it is available then increment counter.
4. print counter

 */
public class LBP52 {
	public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       String s1=obj.nextLine(),s2=obj.nextLine();        
	       int counter=0;
	       for(int i=0;i<s2.length();i++){
	           for(int j=0;j<s1.length();j++){
	             if(s1.charAt(j)==s2.charAt(i)) 
	               counter++;
	           }    
	       }
	        System.out.println(counter);
	    }
}
