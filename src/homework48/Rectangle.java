package homework48;

public class Rectangle {
    public final int length;
    public final int width;
    private final long area;

    public Rectangle(int a, int b) {
        length = Math.max(a, b);
        width = Math.min(a, b);
        area = (long) a * (long) b;

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public long getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{length=" + length + ", width=" + width + "} (square: " + area + ")";
    }
}
