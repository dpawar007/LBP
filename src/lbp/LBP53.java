package lbp;

import java.util.Scanner;

/*
Given a string s, and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string, return shuffled string.

input ---------> a string and an array
constraint ----> no
output --------> a string

Ex:

s=art
a=102

s[0]=a s[1]=r s[2]=t
a[0]=1 a[1]=0 a[2]=2

ts[0]=r
ts[1]=a
ts[2]=t

ts[a[i]]=s[i]

i=0 ---> ts[a[0]]=s[0] ---> ts[1]=a
i=1 ---> ts[a[1]]=s[1] ---> ts[0]=r
i=2 ---> ts[a[2]]=s[2] ---> ts[2]=t

ts[0],ts[1],ts[2] ---> rat

 */
public class LBP53 {
	  public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       String s=obj.nextLine();
	       int a[]=new int[s.length()];       
	      for(int i=0;i<s.length();i++) 
	         a[i]=obj.nextInt();       
	      char b[]=new char[s.length()];
	      for(int j=0;j<s.length();j++) 
	          b[a[j]]=s.charAt(j);       
	     System.out.println(new String(b));  
	    }
}
