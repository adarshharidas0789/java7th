package basics;
class Birds1{
	public void sound() {
		System.out.println("koo koo koooo");
	}}
	class Crow extends Birds1 {
		public void sound() {
			super.sound();
			System.out.println("keee kee kee");
		}
	}

public class Metheodoverridings {

	public static void main(String[] args) {
		
		Crow k = new Crow();
		k.sound();

	}

}
