package lbp;

import java.util.Scanner;

public class LBP74_1 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s=obj.nextLine();
        int len=s.length();
        if(len%2==0)
            System.out.println(s.substring(len/2-1,len/2+1));
        else
            System.out.println(s.substring(len/2,len/2+1));
    }
}
