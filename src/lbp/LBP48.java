package lbp;

import java.util.Scanner;

/*
Accept video length in minutes the format is mm:ss in String format, create a function that takes video length and return it in seconds.

input --------> video length in mm:ss
constraint----> no
output -------> length in seconds


01:00 ----> 60
02:02 ----> 122
02:01 ----> 121

Logic:
------
1. read mm:ss in string format.
2. extract mm from str and convert it into int m.
3. extarct ss from str and convert it into int s.
4. print m*60+s

 */
public class LBP48 {

	 public static void main(String[] args) {
	      Scanner obj = new Scanner(System.in);
	      String vl=obj.nextLine();
	      String[] l=vl.split(":");
	      int m = Integer.parseInt(l[0]);
	      int s = Integer.parseInt(l[1]);
	      System.out.println((m*60)+s);
	      
	    }
}
