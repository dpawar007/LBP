package lbp;

import java.util.Scanner;

/*
Magic Date

Program to read date, month and year from the user and check whether it is magic date or not. Here are the rules for magic date.

1) mm*dd is a 1-digit number that matches the last digit in YYYY
2) mm*dd is a 2-digit number that matches the last two digits in YYYY
3) mm*dd is a 3-digit number that matches the last three digits in YYYY

input --------> three int values
constraint----> no
output -------> true or false

Ex:
1-1-2001 ---> 1*1=1 ---> true
1-1-2002 ---> 1*1=1 ---> false
5-2-2010 ---> 5*2=10 --> true
 */
public class LBP46 {
	public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       String date=obj.nextLine();
	       String p;
	       int d = Integer.parseInt(date.substring(0,1));
	       int m = Integer.parseInt(date.substring(2,3));
	       String y = date.substring(4);    
	       p=String.valueOf(d*m);
	    /*   if(p.length()==1)
	       System.out.println(y.substring(3).equals(p)?true:false);      
	       else if(p.length()==2)
	       System.out.println(y.substring(2).equals(p)?true:false);                 
	       else if(p.length()==3)
	       System.out.println(y.substring(1).equals(p)?true:false);*/             
	       
	       System.out.println(y.endsWith(p)?true:false);             
	    }
}
