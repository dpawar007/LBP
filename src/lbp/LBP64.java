package lbp;

import java.util.Scanner;

/*
X's and O's, Nobody knows

Create a function that takes a string, check if it has the same number of x's and o's and returns either true or false.

Rules:
1. return boolean value true or false.
2. returns true if the amount x's and o's are the same.
3. returns false if they are not the same amount.
4. the string can contains any character.
5. when 'x' and 'o' are not in the string, return true.

input ---------> a string
constraints----> no
output --------> true or false

xc & xo

xc==0 and xo==0 then return true
else
	xc==xo then return true
	else return false

 */
public class LBP64 {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s=obj.nextLine();
	        int oc=0,xc=0;
	        for(int i=0;i<s.length();i++){
	            char c=s.charAt(i); 
	            if(c=='o') oc++;
	            if(c=='x') xc++;             
	        }
	        System.out.println(oc==xc);
}
}
