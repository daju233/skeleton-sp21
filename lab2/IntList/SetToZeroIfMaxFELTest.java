package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SetToZeroIfMaxFELTest {

    @Test
    public void testZeroOutFELMaxes1() {
        IntList L = IntList.of(9,10);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("9 -> 10", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes2() {
        IntList L = IntList.of(202,10,404,202,404);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 0 -> 0 -> 0 -> 0", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes3() {
        IntList L = IntList.of(5, 35, 11, 10,0,535);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 0 -> 0 -> 0 -> 0 -> 0", L.toString());
    }
    @Test
    public void testZeroOutFELMaxes4() {
        IntList L = IntList.of(0,0);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 0", L.toString());
    }
}
