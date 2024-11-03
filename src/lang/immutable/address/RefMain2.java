package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("파리");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setData("뉴욕");
        System.out.println("뉴욕 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
