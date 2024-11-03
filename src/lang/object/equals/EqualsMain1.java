package lang.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        User1 user1 = new User1("100");
        User1 user2 = new User1("100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));
    }
}

// 동일성은 두 객체의 참조값이 완전히 같은지 비교하는 것이다.
// 동등성은 두 객체가 논리적으로 같은지 비교하는 것이다. ex- 주민등록번호
// Object가 기본적으로 제공하는 equals()는 동일성 비교이다.