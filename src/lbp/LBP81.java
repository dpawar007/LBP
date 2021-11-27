package lbp;

import java.util.Scanner;

/*
Even Length Words

Write a program to print even length words in a string?

input -----> a string from the user
con -------> no
output ----> list of strings with even length
 */
public class LBP81 {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);         
	        String sa[]=obj.nextLine().split(" ");
	        for(String t:sa){             
	            if(t.length()%2==0)
	                System.out.print(t+" ");
	        }
	    }
}
