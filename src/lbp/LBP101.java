package lbp;

import java.util.Scanner;

/*
reading and writing an array

Implement a program to read an array element and write on the screen.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> the given array

array: collection of elements

C -------> arrays --------> mutable (modifications are allowed) ----> 1-D & 2-D
C++ -----> arrays --------> mutable (modifications are allowed) ----> 1-D & 2-D
Java ----> arrays --------> immutable (modifications are not allowed), collections ---> 1-D & 2-D
python --> no arrays -----> list ---> mutable (modifications are allowed) ----> 1-D ---> 2-D = nested list

5 elements ====> [1,2,3,4,5]
3x3 

[
[1,2,3],
[4,5,6],
[7,8,9]
]

py ===> [[1,2,3],[4,5,6],[7,8,9]]

 */
public class LBP101 {
	public static void main(String[] args) {       
	      Scanner obj = new Scanner(System.in);
	      int l = obj.nextInt(),s[]=new int[l];
	      for(int i=0;i<l;i++){
	          s[i]=obj.nextInt();
	        }        
	      for(int i=0;i<l;i++){
	        System.out.print(s[i]+" ");
	      }

	    }
}
