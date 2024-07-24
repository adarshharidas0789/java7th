package basics;

import java.util.Scanner;

public class Aawr2 {

	public static void main(String[] args) {
		int row,i,j,col;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of the row");
		row=sc.nextInt();
		System.out.println("enter the size of the colum");
		col=sc.nextInt();
		int aar2[][]=new int[row][col];
		
		System.out.println("enter the elements");
		for( i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				aar2[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("the new array is :");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.println(aar2[i][j]+"\t");
			}
				
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
