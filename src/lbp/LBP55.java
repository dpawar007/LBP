package lbp;
import java.util.Scanner;
/*
 Check if String ending matches second String

Create a function/method that takes two Strings and returns true if the first string ends with second string, otherwise return false.

Input:  two strings
Constraints: No 
Output: true or false


abc,c ----> true
kalyan,an --> true
kalyan,a ---> false
 */

public class LBP55 {
	 public static void main(String[] args) {
	        Scanner obj=new Scanner(System.in);
	        String s1= obj.nextLine();
	        System.out.println(s1.endsWith(obj.nextLine()));
	    }
}
