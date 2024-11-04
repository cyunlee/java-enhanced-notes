package lang.wrapper.ex;

public class WrapperEx3 {
    public static void main(String[] args) {
        String str = "100";

        Integer myInteger = Integer.valueOf(str);
        int newInt = myInteger.intValue();
        Integer newInteger = Integer.valueOf(newInt);

        System.out.println("myInteger = " + myInteger);
        System.out.println("newInt = " + newInt);
        System.out.println("newInteger = " + newInteger);
    }
}

// 문자를 숫자로 바꾸는 것은 오토 언박싱, 오토 박싱이 불가능하다.
