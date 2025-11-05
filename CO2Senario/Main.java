package CO2Senario;

class Aimal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class dog extends Aimal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Aimal a = new dog();
        a.sound();
    }
}
