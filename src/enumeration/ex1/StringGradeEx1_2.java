package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " +vip);

        // 오타
        int ddiamond = discountService.discount("DDIAMOND", price);
        System.out.println("DDIAMOND 등급의 할인 금액: " + ddiamond);
    }

}

// 문자열로 비교를 하면 존재하지 않는 것을 입력 / 오타 발생 / 소문자로 입력하는 경우의 수들이 존재한다.
// -> 타입 안정성이 부족하고, 데이터의 일관성이 떨어진다.