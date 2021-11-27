package lbp;
import java.util.Scanner;
/*
Index of first vowel

create a function that returns the index of first vowel in a string

input ------> a string
con --------> no
output -----> an int value

 */
public class LBP75 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String s = obj.nextLine();
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println(i);
				break;
			}
	}
}
