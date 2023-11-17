package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(18, 17, 16, 15, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("18 -> 289 -> 16 -> 15 -> 18", lst.toString());
        assertTrue(changed);
        IntList lst2 = IntList.of(4, 11, 2, 5, 23);
        boolean changed2 = IntListExercises.squarePrimes(lst2);
        assertEquals("4 -> 121 -> 4 -> 25 -> 529", lst2.toString());
        assertTrue(changed2);
        IntList lst3 = IntList.of(4, 11, 2, 5, 23);
        boolean changed3 = IntListExercises.squarePrimes(lst3);
        assertEquals("4 -> 121 -> 4 -> 25 -> 529", lst3.toString());
        assertTrue(changed3);
    }
}
