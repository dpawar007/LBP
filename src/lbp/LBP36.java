package lbp;

import java.util.Scanner;

/*
Implement a program to return First capital letter in a String

input -------> A string from the user
constraint --> non-empty string
output ------> First Capital letter

Logic:
------
ASCII values ----> A=65 and Z=90

for(i=0;s[i];i++){
	if(s[i]>=65 && s[i]<=90){
		printf(s[i]);
		break;
	}
}
 */
public class LBP36 {
	   public static void main(String[] args) {
	         Scanner obj = new Scanner(System.in);
	         String str = obj.nextLine();
	         for(int i = 0; i<str.length();i++){
	             if(str.charAt(i)>=65 && str.charAt(i)<=90){
	                 System.out.println(str.charAt(i));
	                 break;
	             }
	         }
	    }
}
