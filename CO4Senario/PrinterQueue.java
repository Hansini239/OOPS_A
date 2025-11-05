package CO4Senario;
import java.util.*;
public class PrinterQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> printJobs = new LinkedList<>();
        printJobs.add("Job1: Report.pdf");
        printJobs.add("Job2: Invoice.docx");
        printJobs.add("Job3: Poster.png");
        ((LinkedList<String>) printJobs).addFirst("URGENT: Resume.docx");
        while (!printJobs.isEmpty()) {
            System.out.println("Processing -> " + printJobs.poll());
        }

        System.out.println("All jobs processed. Queue empty? " + printJobs.isEmpty());
	}

}
