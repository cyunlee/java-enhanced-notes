package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

// 박싱 : 기본형 -> 래퍼 클래스
// 언박싱 : 래퍼 클래스 -> 기본형
