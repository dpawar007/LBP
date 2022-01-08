package lbp;

import java.util.Scanner;

/*
sum of palindrome numbers in an array

Implement a program to read an array elements and print sum of all palindrome numbers in array.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all palindrome numbers

logic:

s=0
for(i=0;i<n;i++){
	if a[i] is pali then add it into s
	if(ispali(a[i])){
		s=s+a[i];
	}
}
 */
public class LBP106 {
	public static boolean isPali(int a){
        int d,r=0,temp=a;
        while(a!=0){
            d=a%10;
            r=r*10+d;
            a=a/10;
        }
        return temp==r;        
    }
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         int n=obj.nextInt(),s=0,a[]=new int[n];
         for(int i=0;i<n;i++){
             a[i]=obj.nextInt();
         }
         for(int i=0;i<n;i++){
             if(isPali(a[i]))
                 s=s+a[i];
         }
        System.out.println(s);
    }
}
