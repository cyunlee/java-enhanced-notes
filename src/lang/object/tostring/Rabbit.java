package lang.object.tostring;

public class Rabbit {
    private String rabbitName;
    private int age;

    public Rabbit(String rabbitName, int age) {
        this.rabbitName = rabbitName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "rabbitName=" + rabbitName + "/" + "age=" + age;
    }
}
