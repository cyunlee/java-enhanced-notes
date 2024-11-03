package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(20);
        ImmutableObj obj2 = obj1.add(40);

        System.out.println("obj1 = " + obj1.getData());
        System.out.println("obj2 = " + obj2.getData());
    }
}

// 불변 객체에서 값을 변경하는 메서드를 작성한 경우 반드시 return 받은 객체를 담을 수 있도록 코드를 작성한다.