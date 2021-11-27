package lbp;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

/*
Duck Number

Program to read a number and check whether it is duck number or not.
Hint: A duck number is a number which has zeros present in it, but no zero present in the begining of the number.

input-------> a number from the user
contraint --> n>=0
output------> Yes or No

123 ============> No
1203 ===========> Yes
1200 ===========> Yes
 */
public class LBP15 {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	     int d,num=obj.nextInt();
	     boolean flag=false;
	     while(num!=0) {
	    	 d = num%10;
	    	 if(d==0) {
	    		 flag=true;
	    		 break;
	    	 }
	    	 num =num /10;
	     }
	     System.out.println((flag==true)?"yes":"No");
	}

}
