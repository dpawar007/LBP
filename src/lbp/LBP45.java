package lbp;
import java.util.Scanner;
/*
 Perfect Number

Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as sum of its factors. (equal to sum of its proper divisors) excluding the number itself.

input ------> a number from the user
constraint -> n>0
output -----> true or false

Ex: 6 =========> 1,2,3,6 => 1+2+3=6 true
Ex: 8 =========> 1,2,4,8 => 1+2+4=7 false


Logic:
------
1. read number n from the user
2. divide n with numbers from 1 to n-1
3. if it is divisible add to s
4. if s==n then print true else false

 */

public class LBP45 {
	 public static void main(String[] args) {
	      Scanner obj = new Scanner(System.in);
	      int n = obj.nextInt(),sum=0;       
	      for(int i=1;i<n;i++){
	          if(n%i==0)
	             sum+=i;
	      }  
	      System.out.println(sum==n?true:false);
	    }
}
