package basics;

public class Execptionprooo {

	public static void main(String[] args) {
		System.out.println("haiii");
		try {
			int a[]= {1,2,3,4,5};
					System.out.println(a[0]);
					
					int num=0;
					int b=num/0;
					System.out.println(b);
		}
		catch(ArithmeticException e1) {
			System.out.println("/ zero");
		}
catch(Exception e){
	System.out.println(e);
	
}
		finally {
			System.out.println("not possible");
		}
	}

}
