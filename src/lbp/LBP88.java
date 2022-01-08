package lbp;

import java.util.Scanner;

/*
American keyboard


Given a string, return the true if that can be typed using letters of alphabet on only
one row's of American keyboard like the image below.
In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

dad ---> true
mom ---> false

Note: 
1. You may use one character in the keyboard more than once. 
2. You may assume the input string will only contain letters of alphabet.

input -------> a string from the user
cons  -------> no
output ------> true or false


logic:

1. read a string s from the user.
2. assign r1="qwertyuiop"
3. assign r2="asdfghjkl"
4. assign r3="zxcvbnmm"
5. fetch char by char from s
6. if it is present in r1 or r2 or r3 increment c1,c2,c3
7. if c1==len s or c2==len s or c3==len s
 */
public class LBP88 {
	   public static void main(String[] args) {
	         Scanner obj = new Scanner(System.in);
	         String s=obj.nextLine();                  
	         int s1c=0,s2c=0,s3c=0,sl=s.length();
	         String s1="qwertyuiop";
	         String s2="asdfghjkl";
	         String s3="zxcvbnm";
	        for(int i=0;i<s.length();i++){
	            if(s1.indexOf(s.charAt(i))!=-1) s1c++;
	            if(s2.indexOf(s.charAt(i))!=-1) s2c++;
	            if(s3.indexOf(s.charAt(i))!=-1) s3c++;
	        }
	          System.out.println(sl==s1c || sl==s2c || sl==s3c );
	    }
}
