package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();
        System.out.println(string);
    }
}

// toString은 Object 클래스의 메서드이다.
// 자바에서 모든 객체는 Object를 최종 부모로 갖는다.
// Object는 공통 기능과 다형성(모든 객체를 담을 수 있다.)을 제공한다.
// Object에서 제공하는 기능 : toString(), equals(), getClass()