package lbp;

import java.util.Scanner;

/*
Change Every Letter to the Next Letter

Write a function that changes every letter to the next letter:

"a" becomes "b"
"b" becomes "c"
"d" becomes "e"
and so on ...

note: there is no z's in test cases, be happy.

input ------> a string from the user
cons -------> no
output -----> modified string


s[i]+1
s.charAt(i)+1
chr(ord(i)+1)
 */
public class LBP82 {
	 public static void main(String[] args) {
	      Scanner obj = new Scanner(System.in);
	      String s= obj.nextLine();
	        for(int i=0;i<s.length();i++){ 
	              if(s.charAt(i)!='z')
	                  System.out.print((char)(s.charAt(i)+1));
	            }
	    }
}
