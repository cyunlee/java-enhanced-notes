package lang.immutable.address;

public class ImmutableAddress {
    private final String data;

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Address{" +
                "data='" + data + '\'' +
                '}';
    }

    public ImmutableAddress(String data) {
        this.data = data;
    }
}

// 불변 클래스를 만드는 방법 -> field 값을 생성자를 제외하면 변경할 수 없도록 설계한다.
// 불변 클래스는 setter 메서드를 가질 수 없다.