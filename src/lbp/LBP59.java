package lbp;

import java.util.Arrays;
import java.util.Scanner;

/*
Anagrams

Two strings a and b are called anagrams, if they contain all the same characters in the same frequencies.

input --------> two strings a and b
constraint ---> no
output -------> true or false


abcd,cdba ----> true
listen,silent--> true

1. read string s1
2. read string s2
3. sort all the characters in s1 ----> abcd
4. sort all the characters in s2 ----> abcd
5. compare sorted s1 and s2 if both are same print true else false
 */
public class LBP59 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        char[] a=s1.toLowerCase().toCharArray();
        char[] b=s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
   }
	}


