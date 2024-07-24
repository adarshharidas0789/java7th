package basics;

//public class Thisme1 {
//	String name;
//	String email;
//	int id;
//	public Thisme1(String name,String email,int id) {
//		name=name;
//		email=email;
//		id=id;
//		
//	}
//	 public void print() {
//		 System.out.println("name  :"+name);
//		 System.out.println("email  :"+email);
//		 System.out.println("id  :"+id);
//		 
//	 }
//
//	public static void main(String[] args) {
//		Thisme1 ob=new Thisme1("adarsh","ada@gmail.com",12);
//		ob.print();
//
//	}
//
//}

//usiing this
public class Thisme1 {
String name;
String email;
int id;
public Thisme1(String name,String email,int id) {
	this.name=name;
	this.email=email;
	this.id=id;
	
}
 public void print() {
	 System.out.println("name  :"+name);
	 System.out.println("email  :"+email);
	 System.out.println("id  :"+id);
	 
 }

public static void main(String[] args) {
	Thisme1 ob=new Thisme1("adarsh","ada@gmail.com",12);
	ob.print();

}

}
