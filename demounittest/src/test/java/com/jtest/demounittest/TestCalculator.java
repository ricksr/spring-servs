package  com.jtest.demounittest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator c = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, c.add(2, 3));
        assertEquals(7, c.add(3, 4));
    }
    @Test
    public void testAdd2() {
        assertEquals(5, c.add(2, 3));
        assertEquals(7, c.add(3, 4));
    }
}