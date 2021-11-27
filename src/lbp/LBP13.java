package lbp;

import java.util.Scanner;

/*
 Number of digits

Implement a program to calculate number of digits in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print number of digits in the number


Logic:
~~~~~~
counter=0
while(n!=0){

	d=n%10;
	counter++;
	n=n/10;
}
print counter


logic:
~~~~~~
read input like a string ---> length of the string
 */
public class LBP13 {
  
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in); 		 
        System.out.println(obj.nextLine().length()); 		
	    
	  /*  int counter = 0,d,num;
	    num = obj.nextInt();
	    while(num!=0) {
	    	d =num%10;
	    	counter ++;
	    	num = num/10;
	    }
	    System.out.println(counter);*/
	}
}
