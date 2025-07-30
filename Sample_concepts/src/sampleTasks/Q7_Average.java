package sampleTasks;
import java.util.Scanner;

public class Q7_Average {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 3 numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double d=(a+b+c)/3;
		
		
		System.out.println(d);
	}

}
