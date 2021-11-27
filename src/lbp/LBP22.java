package lbp;

import java.util.Scanner;

public class LBP22 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int d, s = 0, n = obj.nextInt();
		int temp = n;
		while (n != 0) {
			d = n % 10;
			s += d;
			n = n / 10;
		}
		System.out.println(temp % s == 0 ? "yes":"No");
	    obj.close();
	}

}
