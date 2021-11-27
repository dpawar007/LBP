package lbp;

import java.util.Scanner;

/*
Find The Sequence Sum

Given three integers i,j&k, a sequence sum to be the value of i+(i+1)+(i+2)..+j+(j-1)+(j-2)+..+k
(increment from i until it equals to j, then decrement from j until equals k). Given values i,j,k. caluclate the sequence sum as described.

int getSequenceSum(int,int,int);

input -------> Three int values
constraints--> no
output ------> sum basd on given constraints

 */
public class LBP27 {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int p,q,s=0,i =obj.nextInt(),j =obj.nextInt(),k =obj.nextInt();
	for(p=i ;p!=j;p++) {s=s+p;}
	for(q=p ;q!=k;p--) {s=s+q;}
	s=s+q;
	System.out.println(s);
	
	}

}
