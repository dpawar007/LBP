package lbp;

import java.util.Scanner;

/*
Oddish or Evenish

Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is Odd, and number is Evenish if the sum of all of its digits is even, if a number is Oddish return Oddish else return Evenish.

input ----------> a number
constraint -----> n>0
output ---------> Oddish or Evenish


Logic:
------
1. read number n from the user.
2. find individual digits sum.
3. if s%2==0 ----> Evenish else Oddish.

 */
public class LBP47 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt(),d,sum=0;
        while(n!=0){
            d=n%10;             
            sum+=d;
            n=n/10;
        }
        System.out.println(sum%2==0?"Evenish":"Oddish");
    }
}
