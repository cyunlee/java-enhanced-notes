package collection.set;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성된다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

    }
}

//HashSet은 데이터의 유일성만 중요하고 순서가 중요하지 않은 경우에 적합하다.
//LinkedHashSet은 HashSet에 연결 리스트를 사용해서 순서를 보장한다.
