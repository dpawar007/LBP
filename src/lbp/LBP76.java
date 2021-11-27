package lbp;

import java.util.Scanner;

/*
Write a function that finds the longest word in a sentence.
If two or more words are found, return the first longest word. 
Characters such as apostophe, comma, period (and the like) count as part of the word 
(e.g. O'Connor is 8 characters long).

input ------> a string from the user
con --------> no
output------> longest word 

c c++ java and python ------> python
1  3    4   3    6

Hello Welcome to the world of Java ----> Welcome
  5       7    2  3    5    2   4
 */
public class LBP76 {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s= obj.nextLine(),temp="";
	        String s1[]=s.split(" ");        
	        for(int i=0;i<s1.length;i++){             
	            if(s1[i].length()>temp.length())
	                temp=s1[i];
	        }
	        System.out.println(temp);
	    }
}
