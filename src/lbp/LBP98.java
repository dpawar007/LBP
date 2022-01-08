package lbp;
import java.util.Scanner;
/*
Check only digits

Implement a program to check if a string contains only digits.

input ----> a string from the user
con ------> no
output ---> Yes or No


s[i]>='0' and s[i]<='9'

 */
public class LBP98 {
	 public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         String s= obj.nextLine();
         int counter=0;
         boolean flag = true;
         for(int i=0;i<s.length();i++){
             char c=s.charAt(i);
             if(c>='0' && c<='9')
                counter++;              
         }
         System.out.println(counter==s.length()?"Yes":"No");
    }
}
