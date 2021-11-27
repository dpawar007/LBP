package lbp;

import java.util.Scanner;

/*
How many vowels

Create a function that takes a string and returns the number of vowels contained within it.

input -----------> a string
constraint ------> no
output ----------> number of vowels

welcome -----> e,o,e ----> 3
prakash -----> a,a ------> 2
abcdefg -----> a,e ------> 2

v=0;
for(i=0;s[i];i++){
	if(s[i] is 'a','e','i','o','u')
		v++;
}
 */
public class LBP63 {
	 public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         String s = obj .nextLine();
         int counter =0;
         for(int i= 0; i<s.length();i++){
         char ch=s.charAt(i);    
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ) 
            counter++;
          }
        System.out.println(counter);
        
    }
}
