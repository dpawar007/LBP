package lbp;

import java.util.Scanner;

/*

Someone has attempted to censor my strings by replacing every vowel with a *, l*k* th*s. 
Luckily, I've been able to find the vowels that were removed.

Given a censored string and a string of the censored vowels, return the original uncensored string.

input --------> original & replacement strings
con ----------> no
output -------> updated string after replacement


H*ll* , eo ----> Hello

Logic:

1. read a string from the user
2. read replacement string s2 from the user.
3. fetch char by char and if * is found then replace that char with char in string.

 */
public class LBP86 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        int j=0;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='*')
            sb.append(s2.charAt(j++));
            else 
                sb.append(s1.charAt(i));
        }
        
        System.out.println(sb);
    }
}
