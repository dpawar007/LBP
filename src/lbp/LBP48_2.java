package lbp;

import java.util.Scanner;

public class LBP48_2 {

	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        String s[] = obj.nextLine().split(":");//02:10===> ["02","10"]
	        int n1,n2;
	        //logic
	        if(s[0].charAt(0)=='0')
	            n1= Integer.valueOf(s[0].charAt(1)-48);
	        else
	            n1= Integer.valueOf(s[0].charAt(0)-48)*10+Integer.valueOf(s[0].charAt(1)-48);
	        if(s[1].charAt(0)=='0')
	            n2= Integer.valueOf(s[1].charAt(1)-48);
	        else
	            n2= Integer.valueOf(s[1].charAt(0)-48)*10+Integer.valueOf(s[1].charAt(1)-48);        
	        System.out.println(n1*60+n2);
	    }
}
