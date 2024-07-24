package basics;
class Duck implements Birds{
	public void sound() {
		System.out.println("quack........quack");
	}
	
}
public class Birds12 implements Birds{

	public static void main(String[] args) {
		Birds12 b=new Birds12();
		b.sound();
		Duck d=new Duck();
		d.sound();//upcastimg
		

	}

	@Override
	public void sound() {
	System.out.println("craaa....craaaa");
		
	}

}
