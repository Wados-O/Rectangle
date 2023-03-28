package homework48;

public class Rectangle {
    public final int length;
    public final int width;
    private final int area;

    public Rectangle(int a, int b) {
        length = Math.max(a, b);
        width = Math.min(a, b);
        area = a * b;

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{length=" + length + ", width=" + width + "} (square: " + area + ")";
    }
}
