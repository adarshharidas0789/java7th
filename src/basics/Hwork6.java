package basics;

import java.util.Scanner;

//6. Write a program to convert a decimal number to binary number

public class Hwork6 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);


	        System.out.print("Enter a decimal number: ");
	        int d = sc.nextInt();

	        String b = dToB(d);

	        System.out.println("Binary representation: " + b);
		

	}

}
