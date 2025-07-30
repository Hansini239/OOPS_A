package sampleTasks;
import java.util.Scanner;
public class Q2_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Roll number:");
		double a=sc.nextDouble();
		System.out.println("Name:");
		sc.nextLine();
		String b=sc.nextLine();
		System.out.println("Percentage");
		double c=sc.nextDouble();
		System.out.println("Age:");
		int d=sc.nextInt();
		System.out.println("Gender");
		char e=sc.next().charAt(0);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
