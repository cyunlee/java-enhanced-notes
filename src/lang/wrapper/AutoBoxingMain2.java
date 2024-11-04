package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

// 오토 박싱 : 컴파일러가 자동으로 Integer.valueOf()
// 오토 언박싱 : 컴파일러가 자동으로 intValue()
