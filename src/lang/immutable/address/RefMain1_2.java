package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("파리");
        Address b = new Address("파리");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "뉴욕");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값 변경 -> " + changeAddress);
        address.setData(changeAddress);
    }
}

// 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
// 처음부터 서로 다른 인스턴스를 참조하게 하면 사이드 이펙트가 생기지 않는다.
// 서로 다른 변수가 하나의 객체를 공유하지 못하게 할 수는 없다. (에러가 생기지 않기 때문이다.)