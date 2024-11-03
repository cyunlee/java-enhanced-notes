package lang.immutable.address;

public class Person1 {
    private String name;
    private Address address;

    public Person1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
