package lbp;

import java.util.Scanner;

/*
 Check Birth day 
 */
public class LBP18 {

	public static int checkBirthday(String month, int day) {
		if (month.equals("july") && day == 5) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String month = obj.nextLine();
		int day = obj.nextInt();
		System.out.println(checkBirthday(month, day));
	}

}
