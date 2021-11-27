package lbp;

import java.util.Scanner;

/*
Returns the middle character of a string

create a function that takes a string and returns, the middle character(s). 
if the word's length is odd return the midlle character. 
if the word's length is even, return the middle two characters.

input -----> a string from the user
constraint-> no
output ----> middle character(s)

abc ------> 3 ------> b
abcd -----> 4 ------> bc

Logic:

if length is even -----> s[n/2-1],s[n/2]
if length is odd ------> s[n/2]
 */
public class LBP74 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s=obj.nextLine();
        int len=s.length();
          if(len%2!=0) 
            System.out.println(s.charAt((len/2)));
          else  
           System.out.println(s.charAt((len/2)-1)+""+s.charAt((len/2)));
        
        
    }
}
