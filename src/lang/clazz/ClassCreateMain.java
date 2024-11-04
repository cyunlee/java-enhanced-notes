package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        // Class<?> aClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}

// 리플렉션을 통해 클래스의 정보를 얻어낼 수 있다.
// -> 인스턴스를 생성할 수도 있고 등등 다양한 기능을 활용할 수 있다.
