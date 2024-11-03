package lang.immutable.address;

public class PersonMain2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("파리");

        Person2 personA = new Person2("사람A", address);
        Person2 personB = new Person2("사람B", address);

        System.out.println("personA = " + personA);
        System.out.println("personB = " + personB);

        // personB.getAddress().setData("뉴욕");
    }
}

// 사람 A와 사람 B의 맨 처음 주소는 모두 파리이다.
// 사람 B의 주소를 뉴욕으로 바꾸면 사람 A의 주소도 뉴욕으로 바뀐다.
// -> 불변 클래스가 아니라 가변 클래스이기 때문이다.
