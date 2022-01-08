package lbp;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
Print First Letter of each Word

Implement a function/Method to return first character in each word from the given input string.

input-----> a string
con-------> no
output ---> first character in each string

 */
public class LBP95 {
	 public static void main(String[] args) {
	        Scanner obj= new Scanner(System.in);
	        String s= obj.nextLine();
	        StringTokenizer st=new StringTokenizer(s);
	        while(st.hasMoreTokens()){
	            System.out.print(st.nextToken().charAt(0));
	        }
	    }
}
