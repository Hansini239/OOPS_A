package CO4Senario;
import java.util.*;
public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	        ArrayList<String> students = new ArrayList<>();
	        students.add("Alice");
	        students.add("Bob");
	        students.add("Charlie");
	        students.add(1, "David");
	        System.out.println("Students: " + students);
	        students.remove("Bob");
	        System.out.println("After removal: " + students);
	        System.out.println("Contains Alice? " + students.contains("Alice"));
	        System.out.println("Total students: " + students.size());
	    

	
}

}