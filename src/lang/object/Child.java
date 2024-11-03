package lang.object;

public class Child extends Parent{
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}

//명시적으로 다른 클래스를 상속 받을 시에 Object를 상속받지 않는다.
//Child -> (명시적 상속) -> Parent -> (묵시적 상속) -> Object