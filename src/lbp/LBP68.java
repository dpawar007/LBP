package lbp;

import java.util.Scanner;

/*
Andy, Ben and Charlotte are playing a board game. 
The three of them decided to come up with a new scoring system. 
A player's first initial ("A","B" & "C") denotes that players scoring a single point. 
Given a string of capital letters. returns an array of the player's scores.

input --------------> A String
constraint ---------> No
output -------------> score

A ------------> 1 0 0
AB -----------> 1 1 0
ABC ----------> 1 1 1
ABCAB --------> 2 2 1

 */
public class LBP68 {
	 public static void main(String[] args) {
	        Scanner obj =new Scanner(System.in);
	        String s= obj.nextLine();
	        int A=0,B=0,C=0;
	        for(int i=0;i<s.length();i++)
	        {   char c=s.charAt(i);
	            if(c=='A') A++;
	            if(c=='B') B++;
	            if(c=='C') C++;
	        }
	        System.out.println(A+" "+B+" "+C);
	    }
}
