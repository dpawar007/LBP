package lbp;

import java.util.Scanner;

/*
Missing Letters

Given a string containing unique letters, 
return a sorted string with the letters that don't appear in the string.

input ---------> a string from the user
con -----------> no
output --------> return missing characters


Logic:

1. read a string s from the user.
2. create an array with 256 ASCII characters
3. read char by char from s
4. a[s[i]]++;

abc

a[97]=1
a[98]=1
a[99]=1
a[100]=0

ASCII 0 to 255

i=97 to 122

97->a and 122->z
 */
public class LBP90 {
	public static void main(String[] args) {
	      Scanner obj = new Scanner(System.in);
	      String s = obj.nextLine();
	        StringBuffer sb = new StringBuffer();
	      for(int i='a' ; i<='z' ;i++){
	          if(s.indexOf(i)==-1)
	              sb.append((char)i);
	         }
	        System.out.println(sb);
	    }
}
