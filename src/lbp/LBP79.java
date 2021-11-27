package lbp;

import java.util.Scanner;

/*
Swap corner words and reverse middle characters

Write a Java program to take an input string and exchange the first and last word and reverse the middle word.

input -------> a string
con ---------> no
output ------> a string

 */
public class LBP79 {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s[]= obj.nextLine().split(" ");         
	        StringBuffer sb = new StringBuffer();
	        for(int i=1;i<s.length-1;i++){
	            sb.append(s[i]);  
	            sb.append(" ");                  
	        }   
	        System.out.println(s[s.length-1]+sb.reverse()+" "+s[0]);
	    }
}
