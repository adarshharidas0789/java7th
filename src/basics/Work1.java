package basics;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ennter the day");
		int day=scan.nextInt();
		switch (day) {
		case 1:System.out.println("mon");
		break;
		case 2:System.out.println("tue");
		break;
		case 3:System.out.println("wed");
		break;
		case 4:System.out.println("the");
		break;
		case 5:System.out.println("fri");
		break;
		case 6:System.out.println("sat");
		break;
		case 7:System.out.println("sun");
		break;
		default:System.out.println("invalid input");
		}
		// TODO Auto-generated method stub

	}

}
