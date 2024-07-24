package basics;
//prametrised constructor
public class Areaofcircle {
	float areaofcircle;
	public Areaofcircle(float pi,int r) {
		areaofcircle=pi*r*r;
		System.out.println("area of circle :"+areaofcircle);
	}

	public static void main(String[] args) {
		Areaofcircle ob= new Areaofcircle(3.14f,6);
		// TODO Auto-generated method stub

	}

}
