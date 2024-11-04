package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);
    }
}

// 래퍼 클래스를 비교할 때에는 equals()를 사용해야 한다.
// equals()로 비교하면 내부에 있는 값으로 비교한다.