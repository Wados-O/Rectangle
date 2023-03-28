package homework48;

public class Rectangle {
    public final int length;
    public final int width;

    public Rectangle(int a, int b) {
        length = Math.max(a,b);
        width = Math.min(a,b);

    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{length=" + length + ", width=" + width + "}";
    }
}
