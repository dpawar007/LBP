package lbp;
import java.util.Scanner;
/*
LBP58

Re-form the word

A word has been split into a left part and right part. Re-form the word by adding both halves together changing the first to an uppercase letter.

input ---------> two strings from the user
constraint ----> no
output --------> concatenated string with caps in first character

prakash babu ---> Prakashbabu

Logic:
------
1. read s1 from the user
2. read s2 from the user
3. concate s1 and s2 and convert first char into upper case.
4. print result
 */
public class LBP58 {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	     String s1=obj.nextLine();     
	     System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+obj.nextLine());

	}

}
