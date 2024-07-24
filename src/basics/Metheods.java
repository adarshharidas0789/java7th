package basics;

public class Metheods {
	// instsance metheod
	public void add() {// if static public static void add()
		int a=10;
		float b=2.3f;
		float sum=a+b;
		System.out.println("sum is :"+sum);
	}

	public static void main(String[] args) {
		Metheods ob= new Metheods();// in static metheod there is no need of object creation
		ob.add();
		// TODO Auto-generated method stub

	}

}
