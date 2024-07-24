package basics;

import java.util.Scanner;

public class Metheods1 {//
	public void add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		System.out.println("enter the second number");
		int num2=scan.nextInt();
		int sum=num1+num2;
		System.out.println("sum is :"+sum);
		
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Metheods1 ob= new Metheods1();// in static metheod there is no need of object creation
		ob.add();
		// TODO Auto-generated method stub

	}

}
