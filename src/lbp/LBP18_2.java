package lbp;
import java.util.Scanner;

public class LBP18_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String month = obj.nextLine();
		int day = obj.nextInt();
		System.out.println((month.equals("july") && day == 5)?1:0);
	}
}
