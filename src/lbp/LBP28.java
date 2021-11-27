package lbp;
/*

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

input --------> a number from the user
constriants --> no
output -------> number of ways


 */
import java.util.Scanner;

public class LBP28 {
	public static int fibo(int n){
        if(n==0 || n==1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
      }
	public static void main(String[] args) {
		System.out.println("entere number");
		Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
        System.out.println(fibo(num));

	}

}
