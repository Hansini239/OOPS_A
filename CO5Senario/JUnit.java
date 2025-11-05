package CO5Senario;


class Calculator {
 public int add(int a, int b) { return a + b; }
 public int subtract(int a, int b) { return a - b; }
}
class CalculatorTest {
 public void testAdd() {
     Calculator c = new Calculator();
     assert c.add(5, 3) == 8 : "Add Test Failed";
     System.out.println("Add Test Passed");
 }
 public void testSubtract() {
     Calculator c = new Calculator();
     assert c.subtract(5, 3) == 2 : "Subtract Test Failed";
     System.out.println("Subtract Test Passed");
 }
}


public class JUnit {
 public static void main(String[] args) {
     CalculatorTest test = new CalculatorTest();
     test.testAdd();
     test.testSubtract();
 }
}

