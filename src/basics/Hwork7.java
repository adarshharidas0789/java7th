package basics;
//7. Write a program to compare two numbers and do the operations 
//
//f_n : 25
//s_n : 39
//
//check the following expressions
//1. 25 != 39
//2. 25 < 39
//3. 25 <= 39

public class Hwork7 {

	public static void main(String[] args) {
		int n=25;
		int m=39;
		
		boolean result1=n!=m;
		System.out.println(result1);
		boolean result2=n<m;
		System.out.println(result2);
		boolean result3=n<=m;
		System.out.println(result3);

	}

}
