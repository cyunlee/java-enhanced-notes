package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bus bus = new Bus();
        Object object = new Object();

        Object[] objects = new Object[]{cat, bus, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("배열에 포함된 객체의 수는: " + objects.length);
    }
}

// Object를 활용해서 인스턴스를 생성할 수 있다.
