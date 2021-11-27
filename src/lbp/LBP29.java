package lbp;

import java.util.Scanner;

/*
Prime Number or Not
Write a program to check whether the given number is prime number or not. A number is said to prime if it is having only two factors. i.e. 1 and number itself.

input ------> a number from the use
constraint--> n>1
output -----> true or false

 */
public class LBP29 {
 public static void main(String[] args) {
	 System.out.println("Enter the Number");
	  Scanner obj = new Scanner(System.in);
      int n=obj.nextInt(),f=0;
      if(n>1){ 
      for(int i=1; i<=n; i++){
          if(n%i==0)
              f++;
      } 
    }
      System.out.println((f==2));
}
}
