package lbp;

import java.util.Scanner;

/*
Determine the color of a chess board square

You are given coordinates, a string that represents the coordinates of a square of the chess board. bellow is the chess board for your reference.

Return True if the saquare is in white, and false if the square is in Black.

The coordinates will always represent a valid chess board square. The coordinates will always have the letter first, and the number second.

input ----------> a string
constraint -----> length of the string is 2, a<=c[0]<=h and 1<=c[1]<=8
output ---------> true or false

 */
public class LBP61 {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner obj = new Scanner(System.in); 
		String s = obj.nextLine();    //h3
		System.out.println(s.charAt(0) - 'a');  //7    
		System.out.println((s.charAt(0) - 'a')+1);  //8 
		System.out.println(s.charAt(1));       //3
		System.out.println((((s.charAt(0) - 'a') + 1) + s.charAt(1))); //59  
		System.out.println((((s.charAt(0) - 'a') + 1) + s.charAt(1)) % 2 != 0);  //true  

	}
	 


}
