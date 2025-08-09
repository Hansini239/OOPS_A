package tasks;

public class Task3_immutability {
	public static void main(String[] args) {
		String a= "ja";
		String b="va";
		
		a=a.concat(b);
		System.out.println(a);
		
	}

}
