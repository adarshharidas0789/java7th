package basics;
abstract class Vehicle1{
	public abstract void start();
	public static void speed() {
		System.out.println("max speed =20");
	}
	
	
}
class Bike1 extends Vehicle1{
	public void start() {
		System.err.println("key start");
	}
	
}
 class Train extends Vehicle1{
	public  void start(){
		System.out.println("switch starting");
}}
public class Abstractpro {

	public static void main(String[] args) {
	Bike1 ob=new Bike1();
	Train ab=new Train();
	ob.start();
	ab.start();

	}

}
