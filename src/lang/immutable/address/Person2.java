package lang.immutable.address;

public class Person2 {
    private String name;
    private ImmutableAddress address;

    public Person2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
