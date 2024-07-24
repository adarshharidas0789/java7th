package basics;

import java.util.Scanner;

public class Area1 {
	public void area(int length) {
		int area1=4*length;
		System.out.println("area of squre is :"+area1);
	}

	public static void main(String[] args) {
		Area1 ob=new Area1();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of squre :");
		int len=scan.nextInt();
		ob.area(len);
		
		
		// TODO Auto-generated method stub

	}

}
