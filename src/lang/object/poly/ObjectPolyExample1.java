package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bus bus = new Bus();

        action(cat);
        action(bus);
    }

    private static void action(Object obj) {
        //obj.sound()
        //obj.move()

        if(obj instanceof Cat cat) {
            cat.sound();
        } else if (obj instanceof Bus bus) {
            bus.move();
        }
    }
}

//Object에는 sound()와 move() 메서드가 없기 때문에 작동하지 않는다.
//그래도 action과 같이 메서드를 구성해야 할 경우 다운캐스팅이 필요하다.