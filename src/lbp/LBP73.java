package lbp;

import java.util.Scanner;

/*
LBP73

VALID ZIP CODE

zipcodes consists of 5 consecutive digits. 
Given a string, write a function to determine whether the input is a valid zip code. 
a valid zipcode is as follows

1. must contain only numbers.
2. it should not contain any spaces.
3. length should be only 5.

input ------> A string
constraint -> no
output -----> true or false

12345 ----> true
12 34 ----> false
1234@ ----> false
A1234 ----> false
51551 ----> true
 */
public class LBP73 {
	  public static void main(String[] args) {
	         Scanner obj = new Scanner(System.in);
	         System.out.println(obj.nextLine().matches("[0-9]{5}"));
	          
	    }
}
