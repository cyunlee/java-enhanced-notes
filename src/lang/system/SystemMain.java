package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다.
        System.out.println("System.getenv() = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("System.getProperties() = " + System.getProperties());

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }
}

// 직접 반복문을 사용해서 배열을 복사하는 것보다 더 빠르게 복사할 수 있다.