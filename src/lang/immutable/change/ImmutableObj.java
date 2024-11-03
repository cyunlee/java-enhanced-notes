package lang.immutable.change;

import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int data;

    public ImmutableObj(int data) {
        this.data = data;
    }

    public ImmutableObj add(int addData) {
        int result = data + addData;
        return new ImmutableObj(result);
    }

    public int getData() {
        return data;
    }
}

// 불변 객체도 값을 바꿀 필요가 있을 경우에는
// -> 자기 자신을 바꾸는 것이 아니라 새로운 인스턴스를 생성하고 반환한다.