package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("value.name() = " + value.name());
            System.out.println("value.ordinal() = " + value.ordinal());
        }
        String input = "gold";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}

// 모든 Enum은 extends Enum (묵시적인 상속!)
// values() : enum을 Array의 형태로 반환한다.
// value.name() : enum 항목의 이름을 반환한다.
// value.ordinal() : enum 항목의 순서를 반환한다. -> 가급적 사용하면 안 된다.
// valueOf() : 주어진 이름과 일치하는 ENUM 상수를 반환한다.