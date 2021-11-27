package lbp;
import java.util.Scanner;
/*
Defanging an IP address

Given a valid IP address, return a defanged version of that IP address. A defanged IP address replaces every period '.' with "[.]".

input ----------> A string
constraint -----> non-empty String
output ---------> replacement String

. ---> [.]

1.1.1.1 ---> 1[.]1[.]1[.]1

Logic:
------
1. read a str from the user
2. replace . with [.]
3. print the result

 */
public class LBP51 {

	public static void main(String[] args) {
		  Scanner obj = new Scanner (System.in);	         
	      System.out.println(obj.nextLine().replace(".","[.]"));

	}

}
