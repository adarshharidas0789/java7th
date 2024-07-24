package basics;
//Write a Java program to accept a number and check whether the number is even or not. Using Ternary Operator

import java.util.Scanner;

public class Hwork8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result);


	}

}
