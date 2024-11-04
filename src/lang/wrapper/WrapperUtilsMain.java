package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10"); // 문자열을 래퍼 객체로 변환하는 것도 가능하다.
        int intValue = Integer.parseInt("10"); //문자열 전용, 기본형을 변환한다.

        // 비교 : compareTo()
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("sum: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}

// valueOf() : 래퍼 타입을 반환한다.
// parseInt() : 문자열을 기본형으로 반환한다.
// compareTo() : 내 값과 인수로 넘어온 값을 비교한다.
// Integer.sum(), Integer,min(), Integer,max() : static 메서드로 덧셈, 작은 값, 큰 값 연산을 수행한다.
