package lang.immutable.change;

public class MutableObj {
    private int data;
    public MutableObj(int data) {
        this.data = data;
    }

    public void add(int addData) {
        data += addData;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
