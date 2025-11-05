package C03Senario;
import java.util.*;
import java.io.*;

public class DataType {

	 public static void main(String[] args) throws Exception {
	        byte b = 10;
	        short s = 3000;
	        int i = 50000;
	        long l = 100000L;
	        float f = 3.14f;
	        double d = 9.87654321;
	        char c = 'A';
	        boolean bool = true;
	        System.out.println("byte size: " + Byte.BYTES + " value: " + b);
	        System.out.println("short size: " + Short.BYTES + " value: " + s);
	        System.out.println("int size: " + Integer.BYTES + " value: " + i);
	        System.out.println("long size: " + Long.BYTES + " value: " + l);
	        System.out.println("float size: " + Float.BYTES + " value: " + f);
	        System.out.println("double size: " + Double.BYTES + " value: " + d);
	        System.out.println("char size: " + Character.BYTES + " value: " + c);
	        System.out.println("boolean value: " + bool);
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter roll number: ");
	        int roll = sc.nextInt();
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        System.out.print("Enter gender (M/F): ");
	        char gender = sc.next().charAt(0);
	        System.out.print("Enter percentage: ");
	        double percent = sc.nextDouble();
	        System.out.printf("Name: %s%nRoll: %d%nAge: %d%nGender: %c%nPercentage: %.2f%%%n", name, roll, age, gender, percent);
	        sc.nextLine();
	        System.out.print("Enter a character to show ASCII: ");
	        char ch = sc.nextLine().charAt(0);
	        int ascii = (int) ch;
	        System.out.println("Character: " + ch);
	        System.out.println("ASCII value: " + ascii);
	        System.out.println("ASCII as integer: " + Integer.valueOf(ascii));
	        FileWriter fw = new FileWriter("output.txt", true);
	        try (BufferedWriter bw = new BufferedWriter(fw)) {
	            bw.write("Student: " + name + ", Roll: " + roll + ", Percent: " + percent);
	            bw.newLine();
	        }
	        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
	        String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println("From file: " + line);
	        }
	        br.close();
	    }
}
