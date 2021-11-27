package lbp;

import java.util.Scanner;

/*
A company wishes to transmit data to another server. The data consists of numbers only. To secure the data during transmission, they plan to reverse the data during transmission, they plan to reverse the data first.
Write an algorithm to reverse the data first


input -----> an integer data, representing the data to be transmitted
output ----> print an integer representing the given data in reverse form

Logic:
-----
1. read n value from the user
2. extract digits one by one and cal reverse.
3. formula: r=r*10+d;
4. print reverse
 */
public class LBP40 {
	 public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         int n = obj.nextInt(),d,rev=0;
         while(n!=0){
             d = n%10;
             rev = rev*10+d;
             n = n/10;
         }
        System.out.println(rev);
    }
}
