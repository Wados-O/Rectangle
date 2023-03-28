package homework48;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleComparatorTests {


    private final Comparator<Rectangle> comparator = new RectangleAreaComparator();

    @Test
    public void usualComparison() {
        Rectangle rect1 = new Rectangle(3, 5);
        Rectangle rect2 = new Rectangle(4, 7);


        int res1 = comparator.compare(rect1, rect2);
        int res2 = comparator.compare(rect2, rect1);

        assertTrue(res1 < 0);
        assertTrue(res2 > 0);
    }

    @Test
    public void lessFirstMoreSecondArea() {
        Rectangle rect1 = new Rectangle(2, 3);
        Rectangle rect2 = new Rectangle(1, 7);


        int res1 = comparator.compare(rect1, rect2);
        int res2 = comparator.compare(rect2, rect1);

        assertTrue(res1 < 0);
        assertTrue(res2 > 0);
    }


    @Test
    public void lessSecondMoreFirstArea() {
        Rectangle rect1 = new Rectangle(3, 2);
        Rectangle rect2 = new Rectangle(7, 1);


        int res1 = comparator.compare(rect1, rect2);
        int res2 = comparator.compare(rect2, rect1);

        assertTrue(res1 < 0);
        assertTrue(res2 > 0);
    }

    @Test
    public void differentSidesSameArea() {
        Rectangle rect1 = new Rectangle(2, 3);
        Rectangle rect2 = new Rectangle(3, 2);


        int res1 = comparator.compare(rect1, rect2);
        int res2 = comparator.compare(rect2, rect1);

        assertEquals(0, res1);
        assertEquals(0, res2);
    }
    @Test
    public void sameRectangles(){
        Rectangle rect1 = new Rectangle(2, 3);
        Rectangle rect2 = new Rectangle(2, 3);


        int res1 = comparator.compare(rect1, rect2);
        int res2 = comparator.compare(rect2, rect1);

        assertEquals(0, res1);
        assertEquals(0, res2);
    }
    @Test
    public void nullRectangles(){
        Rectangle rect = new Rectangle(2,3);
        assertThrowsExactly(NullPointerException.class, () -> comparator.compare(null, rect));
        assertThrowsExactly(NullPointerException.class, () -> comparator.compare(rect, null));
        assertThrowsExactly(NullPointerException.class, () -> comparator.compare(null, null));
    }
}

