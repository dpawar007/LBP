package lbp;

import java.util.Scanner;

/*
Implement a program to calculate toggle case of each characters of a string

input -------> A String from user
constriant --> non-empty String
output ------> toggle case string

Hello ----> hELLO

char ch='';

Logic:
------
1. read a string from the user.
2. extract char by char from the user.
3. if char is in lower case convert it into upper case & vice versa.

 */
public class LBP37 {

	  public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s = obj.nextLine();
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
	                 sb.append((char)(s.charAt(i)-32));
	            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
	                 sb.append((char)(s.charAt(i)+32));
	            }else{
	                  continue;
	            }
	        }
	        System.out.println(sb);
	    }

}
