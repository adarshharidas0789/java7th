package basics;

import java.util.Scanner;

public class Arw1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,size;
		System.out.println("enter the size of the array :");
		size=sc.nextInt();
		int arr1[]=new int [size];
		System.out.println("enter the elements of the array  :");
		for(i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		
		
		System.out.println("the new array is");
		for(i=0;i<size;i++) {
			System.out.println(arr1[i]);
		}
		// TODO Auto-generated method stub

	}

}
