package java2;

import java.util.Scanner;

public class Even {
	public static void main(String[]args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the end limit:");
		int limit=sc.nextInt();
		for(int i=2;i<limit;i+=2) {
			System.out.println(i);
		}
		
	}

}
