package lbp;
/*
Space between each character

Create a function that takes a string and returns a string with spaces in between all of the characters.

input ------------> a string
constraints-------> No
output -----------> string

welcome -----> w e l c o m e
 */
import java.util.Scanner;

public class LBP70 {
	 public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         String s=obj.nextLine();
         for(int i=0;i<s.length();i++)             
         System.out.print(s.charAt(i)+" ");
    }
}
