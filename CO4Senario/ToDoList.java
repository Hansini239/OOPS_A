package CO4Senario;
import java.util.ArrayList;
import java.util.Collections;
public class ToDoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        ArrayList<String> tasks = new ArrayList<>();
		        tasks.add("Buy groceries");
		        tasks.add("Study Java");
		        tasks.add("Workout");
		        System.out.println("Task at index 1: " + tasks.get(1));
		        tasks.remove("Buy groceries");
		        Collections.sort(tasks);
		        System.out.println("Sorted Tasks: " + tasks);
		        System.out.println("Is To-Do List empty? " + tasks.isEmpty());
		    }

	}


