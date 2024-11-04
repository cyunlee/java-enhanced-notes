package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class; // 클래스를 조회한다.
        // Class clazz1 = new String().getClass(); // 인스턴스에서 조회한다.
        // Class.forName("java.lang.String"); // 문자열로도 클래스의 정보를 조회할 수 있다.

        // 모든 필드를 출력한다.
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("field = " + field);
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("SuperClass: " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface.getName());
        }
    }
}

// getType(), getName()으로 정보를 확인할 수 있다.
// main 옆에 throws - 체크 예외
