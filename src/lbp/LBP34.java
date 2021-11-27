package lbp;
import java.util.Scanner;
import java.util.regex.*;
/*
Email name should be starts with alphabet and should follw by number or underscore. It should contains either numbers or underscore finally ends with gmail.com only, Then given email id is true otherwise false.

input ------> email id
constraint -> lowercase alphabet [a-z] followed by underscore or digit and gmail.com
output -----> true or false

abc@gmail.com ----------------> false
abc1@gmail.com ---------------> true
abc_@gmail.com ---------------> true
abc1_@gmail.com --------------> false
abc12@gmail.com --------------> false
abc__@gmail.com --------------> false

Logic:
------
1. read a string from the user
2. first compare all the alphabets are there or not.
3. after laphabets number or _
4. ends with @gmail.com
5. step2 and 3 and 4 are true ----> true else false

 */
public class LBP34 {

	public static void main(String[] args) {
		System.out.println("Enter Mail ID");
		Scanner obj = new Scanner(System.in);
		String mail = obj.nextLine();
		Pattern P = Pattern.compile("[a-z]+[_|0-9]@gmail[.]com");
		Matcher M = P.matcher(mail);
		System.out.println(M.find());
	    System.out.println(M.find() && (M.group(mail).equals(mail)));
	}
}
