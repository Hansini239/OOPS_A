package CO2Senario;

abstract class Shape {
    abstract void draw();
}
class circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Shape s = new circle();
        s.draw();
    }
}
