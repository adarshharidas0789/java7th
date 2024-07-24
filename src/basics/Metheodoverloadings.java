package basics;

public class Metheodoverloadings {
	public void add() {
		int a,b,c;
		a=10;
		b=22;
		c=a+b;
		System.out.println("sum:"+c);
		
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,float b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		Metheodoverloadings ob= new Metheodoverloadings();
		ob.add(2,3 , 4);

	}

}
