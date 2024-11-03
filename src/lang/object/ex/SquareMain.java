package lang.object.ex;

public class SquareMain {
    public static void main(String[] args) {
        Square square1 = new Square(80, 40);
        Square square2 = new Square(80, 40);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square1 == square2);
        System.out.println(square1.equals(square2));
    }
}
