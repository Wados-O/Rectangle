package homework48;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

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
    @Test
    public void zeroSides(){
        assertThrowsExactly(IllegalAccessException.class, ()-> new Rectangle(0,3));
        assertThrowsExactly(IllegalAccessException.class, ()-> new Rectangle(3,0));
        assertThrowsExactly(IllegalAccessException.class, ()-> new Rectangle(0,0));

    }
    @Test
    public void negativeSides(){
        assertThrowsExactly(IllegalAccessException.class, ()-> new Rectangle(-1,3));
        assertThrowsExactly(IllegalAccessException.class, ()-> new Rectangle(3,-1));
        assertThrowsExactly(IllegalAccessException.class, ()-> new Rectangle(-2,-3));

    }
}
