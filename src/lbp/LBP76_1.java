package lbp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LBP76_1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int m = 0;
		String t = new String();
		String r = new String();
		while (st.hasMoreTokens()) {
			t = st.nextToken();
			if (t.length() > m) {
				m = t.length();
				r = t;
			}
		}
		System.out.println(r);

	}
}
