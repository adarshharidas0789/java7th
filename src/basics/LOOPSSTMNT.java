package basics;

public class LOOPSSTMNT {

	public static void main(String[] args) {
//		int i;
//		for(i=1;i<=10;i++)
//			System.out.println(i*2);
		// TODO Auto-generated method stub
		// nested lopp
//		int num=5,i,j;
//		for ( i=1;i<=num;i++) {
//			for(j=5;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		//while loop
//		int i=10;
//		while (i<=20) {
//			System.out.println(i);
//			i*=2;
//		}
		
		//do while
//		int i=1;
//		do {
//			System.out.println(i);
//			i+=2;
//		}while(i<=6);
		// break 
//		for(int i=0;i<5;i++) {
//			System.out.println(i);
//			if (i==2)
//			break;
//		}
		//contyinue statement
		out:for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==2&&j==2) {
					continue out;
				}
				System.out.println(j);
			}
		}
	}
}

