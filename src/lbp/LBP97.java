package lbp;
import java.util.Scanner;
/*
Number of consonants

Implement a program to return number of consonants present in the given string

input ---------> a string from the user
con -----------> non-empty string
output --------> return number of consonants
 */
public class LBP97 {
	  public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s=obj.nextLine();
	        int c=0;
	        for(int i=0;i<s.length();i++){
	            char ch = s.charAt(i);
	            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' )
	                continue;
	            else
	                c++;
	        }
	        System.out.println(c);
	    }
}
