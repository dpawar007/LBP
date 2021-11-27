package lbp;

import java.util.Scanner;

/*
Sum of digits between two numbers

Create a function that sums the total number of digits between two numbers inclusive. for example, if the numbers are 19 and 22, then (1+9)+(2+0)+(2+1)+(2+2)=19.

input ----------> a number from the user
constraints ----> no
output ---------> sum of digits


Logic:
------
1. read n1 and n2
2. run a loop from n1 to n2 ---> i
3. cal sum of digitis s=s+sumofd(i)

for(i=n1;i<=n2;i++){
	s=s+sumofd(i);
}
 */
public class LBP50 {

	static int sum(int n){
	     int d,sum=0;
	             while(n!=0){
	                 d=n%10;
	                 sum+=d;
	                 n/=10;
	             }
	      return sum;
	 }
	    public static void main(String[] args) {
	         Scanner obj = new Scanner(System.in);
	         int n1=obj.nextInt(),n2=obj.nextInt(),d,tsum=0;
	         for(int i=n1; i<=n2; i++){
	             tsum=tsum+sum(i);
	         }
	        System.out.println(tsum);        
	    }

}
