package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        // integerBox.set("문자100");
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}

// 생성 시점에 T의 타입을 결정한다.
// 제너릭을 활용하면 코드 재사용성이 좋아지고, 타입 안정성이 보장된다.
// -> 생성 시점에 원하는 타입을 지정할 수 있다.
// 타입 추론 -> 생성하는 제네릭 타입을 생략할 수 있다.
// 제네릭의 핵심은 사용할 타입을 클래스의 생성 시점에 결정한다는 것에 있다.