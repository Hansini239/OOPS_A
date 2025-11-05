package CO5Senario;

class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        w1.start();
        w2.start();
    }
}