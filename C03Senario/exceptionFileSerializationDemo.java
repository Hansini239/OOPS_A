package C03Senario;
import java.io.*;
import java.util.*;

class DataTooLargeException extends Exception {
    public DataTooLargeException(String m) { super(m); }
}

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    public Person(String n,int a){name=n;age=a;}
    public String toString(){return "Person{name="+name+",age="+age+"}";}
}

public class exceptionFileSerializationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter filename to write text: ");
            String fname = sc.nextLine();
            try (FileWriter fw = new FileWriter(fname); BufferedWriter bw = new BufferedWriter(fw)) {
                System.out.print("Enter a line to write: ");
                String line = sc.nextLine();
                if (line.length() > 1000) throw new DataTooLargeException("Line too long");
                bw.write(line);
            }
            try (FileInputStream fis = new FileInputStream(fname); ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                byte[] buf = new byte[64];
                int r;
                while ((r = fis.read(buf)) != -1) bos.write(buf,0,r);
                System.out.println("Read bytes length: " + bos.size());
            }
            Person p = new Person("Alex",30);
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
                oos.writeObject(p);
            }
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
                Object o = ois.readObject();
                System.out.println(o);
            }
        } catch (DataTooLargeException e) {
            System.out.println("Custom exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}