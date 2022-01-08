package lbp;

import java.util.Scanner;

/*
sum of odd numbers in an array

Implement a program to read an array elements and print sum of all odd elements.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all odd elements

 */
public class LBP104 {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        int l=obj.nextInt(),a[]=new int[l],sum=0;
	        for(int i=0;i<l;i++){
	         a[i]=obj.nextInt();   
	        }
	        for(int i=0;i<l;i++){
	            if(a[i]%2!=0)
	             sum=sum+a[i];
	        }
	        System.out.println(sum);
	    }
}
