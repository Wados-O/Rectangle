package homework48;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void Width(){

        int sideA = 3;
        int sideB = 5;
        int width = Math.min(sideA,sideB);


        Rectangle rect = new Rectangle(sideA,sideB);


        assertEquals(width, rect.getWidth());
    }
    @Test
    public void Length(){

        int sideA = 3;
        int sideB = 5;
        int length = Math.max(sideA,sideB);
        Rectangle rect = new Rectangle(sideA,sideB);




        assertEquals(length, rect.getLength());
    }
    @Test
    public void area(){
        int sideA = 3;
        int sideB = 5;
        Rectangle rect = new Rectangle(sideA,sideB);


        int length = Math.max(sideA,sideB);

        assertEquals(length, rect.getLength());
    }
}
