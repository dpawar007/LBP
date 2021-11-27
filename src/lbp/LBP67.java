package lbp;

import java.util.Scanner;

/*
Double Letters

Create a function that takes a word and returns true if the word has two consecutive identical letters.

input ---------> A string
constraint-----> No
output --------> true or false

abbc ----> true
abcb ----> false

Logic:
------
if s[i]==s[i+1] then flag=true 
 */
public class LBP67 {
	   public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s= obj.nextLine();
	        boolean flag=false;
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i)==s.charAt(i+1)){
	                flag=true;
	                break;
	            }
	        }         
	        System.out.println(flag);
	    }
}
