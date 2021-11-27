package lbp;

import java.util.Scanner;

/*
 * problem:
The e-commerce company Bookshelf wishes to analyse its monthly sales data between minimum range 30 to max range 100. The company has categorized these book sales into four groups depending on the number of sales with the help of these groups the company will know which stock they should increase or decrease in their inventory for the next month. the groups are as follows

sales range		groups
30-50 ------------------> D
51-60 ------------------> C
61-80 ------------------> B
81-100 -----------------> A

write an alg to find the group for the given book sale count.

input--------> an integer salesCount represent total sales of a book
output-------> a character representing the group of given sale count
constraint---> 30<=saleCount<=100

Logic:- 
Read salesCount from user
if salesCount lies between 30 and 100
print A if slaesCount is in between 81 to 100
print B if slaesCount is in between 61 to 80
print C if slaesCount is in between 51 to 60
print D if slaesCount is in between 30 to 50

*/
public class LBP4 {

	public static void main(String[] args) {
		Scanner bcount = new Scanner(System.in);
		int count = bcount.nextInt();
		if (count >= 30 && count <= 100) {
			if (count >= 30 && count <= 50)
				System.out.println("D");
			else if (count >= 51 && count <= 60)
				System.out.println("C");
			else if (count >= 61 && count <= 80)
				System.out.println("B");
			else  
				System.out.println("A");
		}else {
			System.out.println("invalid");
		}
		 
		
	}

}
