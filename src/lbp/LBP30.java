package lbp;

import java.util.Scanner;

public class LBP30 {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
         String n=obj.nextLine();
         System.out.println(new StringBuffer(n).reverse().toString().equals(n)?"valid":"invalid"); 
          
	}

}
