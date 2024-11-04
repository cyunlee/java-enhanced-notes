package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
    }
}

// 제네릭 클래스에서 타입 인자를 넣지 않으면 Object로 된다.
// rowType을 쓰면 안된다. 만약 Object를 쓰고 싶다면 타입 인자로 Object를 명시해줘야 한다.
