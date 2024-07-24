package basics;
//3.  Java Program to Swap Two values using third variable  and without using third variable

import java.util.Scanner;

public class Hwork3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number a=");
		int a=sc.nextInt();
		System.out.println("enter the second number b=");
		int b=sc.nextInt();
//		int swap=a;
//		a=b;
//		b=swap;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a="+a);
		System.out.println("after swaping b="+b);
		
//		
		
		// TODO Auto-generated method stub

	}

}
