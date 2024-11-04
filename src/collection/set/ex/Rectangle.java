package collection.set.ex;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

}
