package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}

// int는 기본형이므로 스스로 메서드를 가질 수 없다.
// 하지만 MyInteger과 같은 객체로 만들어주면 스스로 메서드를 가질 수 있고 객체지향적으로 설계할 수 있다.