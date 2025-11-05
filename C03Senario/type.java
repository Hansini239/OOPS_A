package C03Senario;
import java.util.*;
public class type {
	 public static void main(String[] args) {
	        int a = 123456;
	        long b = a;
	        float c = b;
	        System.out.println("int: " + a);
	        System.out.println("long: " + b);
	        System.out.println("float: " + c);
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a double value: ");
	        double dv = sc.nextDouble();
	        int iv = (int) dv;
	        System.out.println("Double: " + dv);
	        System.out.println("Casted to int: " + iv);
	    }

}
