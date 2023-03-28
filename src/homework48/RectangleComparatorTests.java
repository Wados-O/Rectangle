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
}
