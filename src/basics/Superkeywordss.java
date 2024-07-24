package basics;
//using instance variyable
class vehicle{
	int maxspeed=200;
}
class bike extends vehicle{
	int maxspeed=150;
	public void display() {
		System.err.println(super.maxspeed);//super class
		System.out.println("max speed:"+maxspeed);
	}
}
public class Superkeywordss {

	public static void main(String[] args) {
		bike b=new bike();
		b.display();
		

	}

}
