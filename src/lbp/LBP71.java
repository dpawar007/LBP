package lbp;
import java.util.Scanner;
/*
VOWEL REPLACER

Create a function that replaces all the vowels in a string with a specified character,

input -----------> A string from the user and a character
cons ------------> no
output ----------> A string


welcome,* ----> w*lc*m*
 */
public class LBP71 {
	 public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       String s1=obj.nextLine();
	       String s2=obj.nextLine();
	       System.out.println(s1.replaceAll("[aeiou]",s2)); 
	    }
}
