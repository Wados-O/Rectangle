package homework48;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void getWidth(){

        int sideA = 3;
        int sideB = 5;
        Rectangle rect = new Rectangle(sideA,sideB);


        int width = Math.min(sideA,sideB);

        assertEquals(width, rect.getWidth());
    }
    @Test
    public void getLength(){

        int sideA = 3;
        int sideB = 5;
        Rectangle rect = new Rectangle(sideA,sideB);


        int length = Math.max(sideA,sideB);

        assertEquals(length, rect.getLength());
    }
}
