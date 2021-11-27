package lbp;

import java.util.Scanner;
/*
LBP31

Create PIN using Three given numbers

"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers.

The three given input numbers will always consist of three digits each i.e. each of them will be in the range >=100 and <=999.

Bellow are the rules for generating the PIN.

1. The PIN should made up of 4 digits.
2. The unit (ones) position of the PIN should be the least of the units position of the three numbers.
3. The tens position of the PIN should be the least of the tens position of the three input numbers.
4. The hundreds position of the PIN should be least of the hundreds position of the three numbers.
5. The thousands position of the PIN should be the max of all digits in the three input numbers.

input ----------> three numbers
constraints ----> all the numbers must be in the range of >=100 and <=999
output ---------> PIN value
 */
public class LBP31 {

	 static int maxDigit(int n){
	     int max=0,d;
	     while(n!=0){
	     d=n%10;
	     if(max<d)
	         max=d;
	     n=n/10;
	    }
	     return max;
	 }
	    
	    public static void main(String[] args) {
	    	System.out.println("Enter the numbers");
	        Scanner obj = new Scanner(System.in);
	        int n1=obj.nextInt();
	        int n2=obj.nextInt();
	        int n3=obj.nextInt();
	        int w = Math.min(n1%10,Math.min(n2%10,n3%10));
	        int x = Math.min((n1/10)%10,Math.min((n2/10)%10,(n3/10)%10));
	        int y = Math.min((n1/100)%10,Math.min((n2/100)%10,(n3/100)%10));
	        int z = Math.max(maxDigit(n1),Math.max(maxDigit(n2),maxDigit(n3)));
	        System.out.println(z*1000+y*100+x*10+w);
	    }
}
