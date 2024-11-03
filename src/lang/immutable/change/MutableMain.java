package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj mutableObj = new MutableObj(20);
        mutableObj.add(40);
        System.out.println("mutableObj = " + mutableObj.getData());
    }
}

// 계산이 진행 된 이후 기존의 값은 사라진다.