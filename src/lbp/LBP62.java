package lbp;

import java.util.Scanner;

/*
Find the Bomb

Write a function that finds the word "bomb" in the given string (not case sensitive) return "DUCK!" if found, else return "Relax there's no bomb."

input ---------> a string
constraint ----> no
output --------> "DUCK!" or "Relax, There's no bomb."

Logic:
------
1. read a string from the user.
2. convert the string into lowercase.
3. search for bomb word in the given string.
4. if result is true then we have to print "DUCK!".
5. if result is false the  print "Relax, There's no bomb."
 */
public class LBP62 {
	   public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);         
	       System.out.println(obj.nextLine().toLowerCase().contains("bomb")?"DUCK!":"Relax, there's no bomb.");
	    }
}
