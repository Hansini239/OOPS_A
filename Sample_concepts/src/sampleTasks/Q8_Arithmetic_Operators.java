package sampleTasks;
import java.util.Scanner;

public class Q8_Arithmetic_Operators {
	public static void main(String[]args) {
		System.out.println("enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		
		double c = (a%b);
		double d = (a/b);
		double e = ((a+b)%(a-b));
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
	}
}
