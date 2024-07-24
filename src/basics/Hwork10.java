package basics;
//10. Write a Java program to find the value of specified expression. 
//
//a) 101 + 0) / 3
//b) 3.0e-6 * 10000000.1
//c) true && true
//d) false && true
//e) (false && false) || (true && true)
//f) (false || false) && (true && true)

public class Hwork10 {

	public static void main(String[] args) {
		float s=(101 +0)/3;
		System.out.println(s);
		float a=(float) (3.0e-6*10000000.1);
		System.out.println(a);
		boolean resulta =true && true;
		System.out.println(resulta);
		boolean resultb =false && true;
		System.out.println(resultb);
		boolean resultc =(false && false) || (true && true);
		System.out.println(resultc);
		boolean resultd =(false || false) && (true && true);
		System.out.println(resultd);
		
		
		

	}

}
