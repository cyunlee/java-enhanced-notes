package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    private Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}

// Grade도 클래스이기 때문에 생성자와 메서드를 선언할 수 있다.