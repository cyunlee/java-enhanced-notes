package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Cat cat = new Cat("Choco");
        Rabbit rabbit1 = new Rabbit("깡총이", 3);
        Rabbit rabbit2 = new Rabbit("귀염댕이", 2);

        System.out.println("1. toString 원본 호출");
        System.out.println(cat.toString());
        System.out.println(rabbit1.toString());
        System.out.println(rabbit2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(cat);
        System.out.println(rabbit1);
        System.out.println(rabbit2);

        System.out.println("3. Object 다형성 활용하기");
        ObjectPrinter.print(cat);
        ObjectPrinter.print(rabbit1);
        ObjectPrinter.print(rabbit2);
    }
}
