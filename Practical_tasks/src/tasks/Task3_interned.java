package tasks;

public class Task3_interned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="java";
		String b=new String("java");
		
		String c="java";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(c.equals(b));
		
		System.out.println("a==b"+" "+(a==b));
		
		
	}

}
