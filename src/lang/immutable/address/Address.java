package lang.immutable.address;

public class Address {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Address{" +
                "data='" + data + '\'' +
                '}';
    }

    public Address(String data) {
        this.data = data;
    }
}
