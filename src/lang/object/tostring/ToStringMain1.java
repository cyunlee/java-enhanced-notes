package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString의 반환값을 출력하면 다음과 같다.
        System.out.println(string);

        //object를 직접 출력
        System.out.println(object);
    }
}

// toString의 반환값과 object의 반환값이 같다.
// -> println() 함수 내부에서 toString을 호출하기 때문이다.