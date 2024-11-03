package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade() {}
}

// private 생성자를 이용해서 외부에서 생성자를 사용하지 못하도록 한다.