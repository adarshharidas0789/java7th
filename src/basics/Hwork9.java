package basics;
//9. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

import java.util.Scanner;

//
//((p + q) == r || (q + r) == p || (r + p) == q)
//
//o/p:-
//Input the first number: 5
// Input the second number: 10 
// Input the third number: 15 
// The result is: true
public class Hwork9 {

	public static void main(String[] args) {
		int p,q,r;
		Scanner sc=new Scanner (System.in);
		System.out.println("input the first number:");
		p=sc.nextInt();
		System.out.println("input the 2nd number:");
		q=sc.nextInt();
		System.out.println("input the 3rd number:");
		r=sc.nextInt();
        boolean result = (p + q == r) || (q + r == p) || (r + p == q);
        
        System.out.println("Result: " + result);
		
		
	

	}

}
