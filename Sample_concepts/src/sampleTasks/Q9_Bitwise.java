package sampleTasks;

import java.util.Scanner;

public class Q9_Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		int c = (a>>b);
		int d = (a|b);
		int e = (a^b);
		int  f= (a<<b);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
