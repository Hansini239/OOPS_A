package CO4Senario;
import java.util.*;
public class UndoRedo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        LinkedList<String> undoStack = new LinkedList<>();
	        LinkedList<String> redoStack = new LinkedList<>();
	        undoStack.push("Typed 'Hello'");
	        undoStack.push("Deleted 'H'");
	        undoStack.push("Typed 'h'");

	        System.out.println("Undo Stack: " + undoStack);

	        String lastAction = undoStack.pop();
	        redoStack.push(lastAction);
	        System.out.println("Undo Action: " + lastAction);
	        System.out.println("Redo Stack: " + redoStack);
	        String redoAction = redoStack.pop();
	        undoStack.push(redoAction);
	        System.out.println("Redo Action: " + redoAction);

	        System.out.println("Final Undo Stack: " + undoStack);
	    }

	
}
