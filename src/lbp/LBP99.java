package lbp;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
Capitalize Every word first character

Implement a program to capitalize first letter of each word in a string.

input ----> a string from the user
con ------> non-empty string
output ---> a string with capitalization

 */
public class LBP99 {
	  public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        StringTokenizer st = new StringTokenizer(obj.nextLine());
	        while(st.hasMoreTokens()){
	            String s = st.nextToken();
	            System.out.print(s.substring(0,1).toUpperCase()+s.substring(1)+" ");
	        }
	    }
}
