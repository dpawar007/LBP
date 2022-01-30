package lbp;

import java.util.Scanner;

public class LBP29_2 {
	public static int nthPrime(int num){		
		int count =0,temp=2;
		while(true){
			boolean flag = false;
			for(int i=2;i<=(temp/2);i++){
				if(temp%i == 0){
					flag = true;
				}
			}
			temp++;
			if(!flag){
				count++;
			}
			if(count == num){
				break;
			}
		}		
		return temp-1;
	}

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		 int n = obj.nextInt();
		 System.out.println(LBP29_2.nthPrime(n));

	}

}
