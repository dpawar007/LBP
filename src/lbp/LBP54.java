package lbp;
import java.util.Scanner;
/*
Get word count

Create a function/method that takes a string and return the word count. The string will be a sentence.

Input: A string 
Constraints: No 
Output: Word count

Logic:

1. read a string/sentence
2. repeat a loop and search for spaces ---> counter++
3. print counter+1

test is my fav class

c=0->1->2->3->4+1

 */
public class LBP54 {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);       
		 System.out.println((obj.nextLine().split(" ")).length);
	}

}
