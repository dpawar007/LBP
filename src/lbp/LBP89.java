package lbp;

import java.util.Scanner;

/*
Rotate String 

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

abcde ---> abcde, bcdea, cdeab, deabc, eabcd

abcdeabcde

Logic:

1. read strings s1 and s2
2. s3 by adding s1+s2
3. s3 contains s2 then return true else false.
 */
public class LBP89 {
	 public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         String s1=obj.nextLine();         
         String s2=obj.nextLine();         
         System.out.println((s1.length() == s2.length()) && (s1+s1).contains(s2));
  }
}
