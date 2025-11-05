package CO5Senario;

import java.util.*;

class Connection {
    private static int idCounter = 1;
    private int id = idCounter++;
    public void connect() {
        System.out.println("Using connection #" + id);
    }
}

class ConnectionPool {
    private Queue<Connection> pool = new LinkedList<>();
    private static ConnectionPool instance;
    private ConnectionPool(int size) {
        for (int i = 0; i < size; i++) pool.add(new Connection());
    }
    public static synchronized ConnectionPool getInstance(int size) {
        if (instance == null) instance = new ConnectionPool(size);
        return instance;
    }
    public synchronized Connection acquire() {
        return pool.isEmpty() ? new Connection() : pool.poll();
    }
    public synchronized void release(Connection c) {
        pool.offer(c);
    }
}

public class ObjPooling {
    public static void main(String[] args) {
        ConnectionPool pool = ConnectionPool.getInstance(2);
        Connection c1 = pool.acquire();
        c1.connect();
        pool.release(c1);
        Connection c2 = pool.acquire();
        c2.connect();
    }
}
