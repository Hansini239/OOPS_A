package C03Senario;
import java.util.*;
public class operators {
	 public static void main(String[] args) {
	        int r1 = 10 + 2 * 5;
	        int r2 = (10 + 2) * 5;
	        int r3 = 100 / 5 + 2 * 3 - 4;
	        System.out.println(r1);
	        System.out.println(r2);
	        System.out.println(r3);
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        double x = sc.nextDouble();
	        double y = sc.nextDouble();
	        double z = sc.nextDouble();
	        double avg = (x + y + z) / 3.0;
	        System.out.println("Average: " + avg);
	        System.out.print("Enter two integers for arithmetic and bitwise: ");
	        int p = sc.nextInt();
	        int q = sc.nextInt();
	        System.out.println("Add: " + (p + q));
	        System.out.println("Sub: " + (p - q));
	        System.out.println("Mul: " + (p * q));
	        System.out.println("Div: " + (q != 0 ? p / q : "undefined"));
	        System.out.println("Mod: " + (q != 0 ? p % q : "undefined"));
	        System.out.println("AND decimal: " + (p & q));
	        System.out.println("OR decimal: " + (p | q));
	        System.out.println("XOR decimal: " + (p ^ q));
	        System.out.println("Left shift p<<1: " + (p << 1));
	        System.out.println("Right shift p>>1: " + (p >> 1));
	        System.out.println("AND binary: " + Integer.toBinaryString(p & q));
	        System.out.println("OR binary: " + Integer.toBinaryString(p | q));
	        System.out.println("XOR binary: " + Integer.toBinaryString(p ^ q));
	        System.out.print("Enter a number to check divisible by 3 and 5: ");
	        int n = sc.nextInt();
	        boolean div = (n % 3 == 0) && (n % 5 == 0);
	        System.out.println(div ? "Divisible by both 3 and 5" : "Not divisible by both");
	    }
}
