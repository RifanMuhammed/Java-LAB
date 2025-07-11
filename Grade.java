package newjavaproject;

import java.util.Scanner;

public class Grades {
 public static void main(String[]args) {
	 Scanner gr=new Scanner(System.in);
	 System.out.println("enter your marks:");
	 int  marks=gr.nextInt();
	 if(marks>=90) {
		 System.out.println ("Grade A");
	 }
	 else if(marks>=75)
	 {
		 System.out.println("grade B");
		 
	 }else {
		 System.out.println("grade C");
		 
	 }
	 gr.close();
 }
}
