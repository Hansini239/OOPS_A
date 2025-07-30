package sampleTasks;
import java.util.Scanner;
public class Q11_Constant_variable {
	public static void main(String[]args) {
		final double PI= 3.14159;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		double r= sc.nextDouble();
		double b = (PI*r*r);
		System.out.println("area of a circle"+" "+b);
		
		double c = (2*PI*r);
		System.out.println("circumference of a circle"+" "+c);
		
	}
}
