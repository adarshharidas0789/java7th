package basics;
//inheritance..........
class Animals{
	String clour;
	public void eat() {
		System.out.println("animal is eating");
	}
}
  class Doog extends Animals{
	  String bred="pug";
	  public void barc() {
		  System.out.println("dog is barking");
	  }
  }

public class Inheritance1 {
	

	public static void main(String[] args) {
		Doog d = new Doog();
		System.out.println("breed="+(d.bred));
		System.out.println("clour="+(d.clour));
		d.eat();
		d.barc();		// TODO Auto-generated method stub

	}

}
