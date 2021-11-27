package lbp;

import java.util.Scanner;

/*
Max Occurring Character

Given a string, implement a program to find max occurring character in the given string

input -------> A string from the user.
constraints--> No
output ------> max occurring character

welcome ----> e
java -------> a

a[0]
a[1]
a[97]=2
a[98]
a[99]=1

Logic:
-----
1. read a string s from the user.
2. create an array with 256 values (0-255).
3. read character from the string store correponding entry in array 
4. find max char by using ASCII concept.

 */
public class LBP60 {
	public static void main(String[] args) {
		System.out.println("Enter the Name");		
		  Scanner obj = new Scanner(System.in);
	        String s = obj.nextLine();
	        int a[]=new int[256];
	        int i,m;
	        for(i=0;i<s.length();i++)
	            a[(int)s.charAt(i)]++;
	        for(i=0,m=0;i<256;i++){
	            if(a[i]>a[m])
	                m=i;
	        }
	        System.out.println((char)m);
	    };
	}

