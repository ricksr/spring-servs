package  com.jtest.demounittest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TestCalculator {
    Calculator c = null;
    CalculatorService service = mock(CalculatorService.class);


    @Before
    public void setUp() {
        c = new Calculator(service);
    }

    @Test
    public void testAdd() {
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(5, c.perform(2, 3));
        verify(service).add(2, 3);

    }
// TEst case 2
//    @Test
//    public void testAdd2() {
//        assertEquals(5, c.add(2, 3));
//        assertEquals(7, c.add(3, 4));
//    }
}