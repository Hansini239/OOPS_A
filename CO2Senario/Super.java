package CO2Senario;

class a {
    String color = "white";
}
class colour extends a {
    String color = "black";
    void printColor() {
        System.out.println(super.color);
    }
}
public class Super {
    public static void main(String[] args) {
        colour d = new colour();
        d.printColor();
    }
}
