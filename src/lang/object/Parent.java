package lang.object;

public class Parent extends Object{
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

//부모가 없으면 묵시적으로 Object 클래스를 상속 받는다
//자바가 자동으로 extends Object를 해주기 때문에 생략하는 것이 좋다.