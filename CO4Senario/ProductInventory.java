package CO4Senario;
import java.util.*;
public class ProductInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> quantities = new ArrayList<>();

        quantities.add(10);
        quantities.add(20);
        quantities.add(15);

        
        quantities.set(1, 25);
        System.out.println("Product Quantities:");
        for (int q : quantities) {
            System.out.println(q);
        }
        int total = 0;
        for (int q : quantities)
            total += q;
        System.out.println("Total Quantity: " + total);
        quantities.clear();
        System.out.println("Inventory cleared. Size: " + quantities.size());
    
	}

}
