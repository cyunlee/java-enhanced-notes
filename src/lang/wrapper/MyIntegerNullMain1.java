package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger value : intArr) {
            if (value.getValue() == target) {
                return value;
            }
        }
        return null;
    }
}

// 기본형은 항상 값이 존재해야 하지만 객체를 사용하면 null도 표현할 수 있다.
// 때로는 값이 없음을 표현할 수도 있어야 하기 때문이다.