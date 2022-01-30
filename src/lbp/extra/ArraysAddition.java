package lbp.extra;

import java.util.Scanner;

public class ArraysAddition {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int l = obj.nextInt();
		int sa[] = new int[l];
		int ta[] = new int[l];

		for (int i = 0; i < l; i++) {
			sa[i] = obj.nextInt();
		}

		ta[0] = sa[0];

		for (int i = 0, j = 1; i < l - 1 && j < l; i++, j++) {
			ta[j] = sa[i] + sa[i + 1];
		}

		System.out.println("target Array");

		for (int i = 0; i < l; i++) {
			System.out.print(ta[i]);
		}

	}

}
