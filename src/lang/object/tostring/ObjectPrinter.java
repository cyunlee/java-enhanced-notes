package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체의 정보를 출력합니다: " + obj.toString();
        System.out.println(string);
    }
}
