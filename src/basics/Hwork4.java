package basics;

import java.util.Scanner;

//4. Write a Java program to print the ascii value of a given character.

public class Hwork4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the charecter");
		 char a = sc.next().charAt(0);

	        
	        int asciiValue = (int) a;

	      
	        System.out.println("ASCII value of '" + a+ "' is: " + asciiValue);
		

	}

}
