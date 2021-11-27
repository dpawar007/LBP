package lbp;

import java.util.Scanner;

/*
Jackson, a math student, is developing an application on prime numbers. for the given two integers on the display of the application, the user has to identify all the prime numbers within the given range (including the given values). afterwards the application will sum all those prime numbers. Jackson has to write an algorithm to find the sum of all the prime numbers of the given range.
Write an algorithm to find the sum of all the prime numbers of the given range.

input -----> two space sepearted integers RL and RR.
output ----> sum of the prime numbers between RL and RR.

Logic:
-----
1. read two numbers n1 and n2
2. for i=n1,i<=n2;i++
3. check whether is it (i) is prime or not
4. if prime add to s
5. print s

 */
public class LBP42 {

	static boolean isPrime(int n){
	    int counter=0;     
	    for(int i=1 ; i<=n ;i++){
	        if(n%i==0)
	            counter++;
	    }
	    return(counter == 2?true:false);
	}
	    public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       int n1=obj.nextInt(),n2=obj.nextInt(),sum=0;
	       for(int i=n1 ; i<=n2 ;i++){
	          if(isPrime(i)){
	          sum = sum + i;   
	        }
	       }
	       System.out.println(sum);
	    }
	    
}
