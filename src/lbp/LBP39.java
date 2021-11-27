package lbp;
import java.util.Scanner;
/*
  Implement the following function
	int BlackJack(int n1,int n2);

the function accepts two +ve integers n1 and n2 as its arguments. Implement the function on given two vlaues to return an int value as follows

return whichever value is nearest to 21 without going over. Return if they go both go over.

input --------> two int values n1 and n2
constraint ---> no
output -------> 0 or n1 or n2

Loigc:

1. read n1 and n2
2. if both are >21 return 0
3. if n1>21 return n2
4. if n2>21 return n1
5. big of n1 and n2
 */
public class LBP39 {
	static int fun(int n1, int n2){
	     if (n1>21 && n2>21)
	         return 0;
	     else if(n1>21)
	         return n2;
	     else if(n2>21)
	         return n1;
	     else 
	         return Math.max(n1,n2);
	  }
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1=obj.nextInt(),n2=obj.nextInt();
        System.out.println(fun(n1,n2));
        
   }
}
