package lbp;

import java.util.Scanner;

public class LBP46_1 {

	public static void main(String[] args) {
		 
		        Scanner obj = new Scanner(System.in);
		        String s[] = obj.nextLine().split("-");
		        int d=Integer.parseInt(s[0]);
		        int m=Integer.parseInt(s[1]);
		        int y=Integer.parseInt(s[2]);
		        String s1 = Integer.toString(d*m);
		        String s2 = Integer.toString(y);
		        /*String s1 = String.valueOf(d*m);
		        String s2 = String.valueOf(y);*/
		        System.out.println(s2.endsWith(s1));
		    }
	}


