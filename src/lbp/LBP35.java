package lbp;

import java.util.Scanner;
/*

The IT company "Soft ComInfo" has decided to transfer its messages through the N/W using new encryption technique. The company has decided to encrypt the data using the non-prime number concept. The message is in the form of a number and the sum of non-prime digits present in the message is used as the encryption key.

Write an algorithm to determine the encryption key.

input ------> The input consists of an integer numMsg representing the numeric form of the message.

output ------> print an integer representing the encryption key.

note: Digit 1 and 0 are considered as a prime number.

Logic:---> sum of non-prime digits (4,6,8,9)

 */
public class LBP35 {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
        Scanner obj = new Scanner(System.in);
        int key = obj.nextInt(),d,sum=0;
        while(key!=0){
            d =key%10;
             if(d==4|d==6|d==8|d==9)
                 sum+=d;
            key=key/10;
        }
       System.out.println(sum);
   }
}
