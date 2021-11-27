package lbp;

import java.util.Scanner;

/*
 Same as LBP12
 */
public class LBP12_2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int d,sum=0,num = obj.nextInt();
		while(num!=0) {
			d=num%10; //1,2,3,4,5,6,7,8,9,0  =====> 3,6,9
			if(d==3 || d==6 || d==9) 
				sum = sum+d;
			 num = num/10;
		}
			System.out.println(sum);
	}  
}
