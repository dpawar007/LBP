package lbp;

import java.util.Scanner;

/*
sum of prime numbers in an array


Implement a program to read an array elements and print sum of all prime elements.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all prime elements
 */
public class LBP105 {
	static boolean isPrime(int n){
	    int fact=0;     
	    for(int i=1;i<=n;i++){
	        if(n%i==0)    
	            fact++;
	    }
	    return fact==2;
	}
	     public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        int l=obj.nextInt(),a[]=new int[l],sum=0;
	        for(int i=0;i<l;i++){
	         a[i]=obj.nextInt();   
	        }
	        for(int i=0;i<l;i++){
	            if(isPrime(a[i]))
	             sum=sum+a[i];
	        }
	        System.out.println(sum);
	    }
}
