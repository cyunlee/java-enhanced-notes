package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i=0; i<iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: = " + (endTime - startTime) + "ms");

        // 래퍼 클래스 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i=0; i<iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long 실행 시간: = " + (endTime - startTime) + "ms");
    }
}

// 기본형의 실행 시간이 래퍼 클래스의 실행 시간보다 월등히 빠르다!
// -> 하지만 숫자의 함정에 빠지면 안된다.
// -> 코드를 유지보수 하기 더 좋은 것을 선택하면 된다. (실생활에서는 차이가 별로 없음)
// -> 유지보수 vs 최적화? => 개발할 때 유지보수 하기 좋은 코드를 작성하는 것이 좋다.