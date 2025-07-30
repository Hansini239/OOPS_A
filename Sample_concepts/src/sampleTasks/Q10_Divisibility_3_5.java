package sampleTasks;
import java.util.Scanner;

public class Q10_Divisibility_3_5 {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
	    double a = sc.nextDouble();
	    
	    if(a%3==0 && a%5==0 ) {
	    	System.out.println("yes");
	    }
	    else {
	    	System.out.println("no");
	    }
	    
	}
	
}
