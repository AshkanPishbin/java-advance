import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComparateTest {
    private Comparate comparate = new Comparate();

    @Test
    void isBigger() {
        boolean actual = comparate.isBigger(0, 2);
        boolean expected = false;
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void isSmaller() {
        boolean actual = comparate.isSmaller(2, 1);
        boolean expected = false;
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void getBiggest() {
        int actual = comparate.getBiggest(List.of(2, 8, 5, 3, 9));
        int expected = 9;
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void getSmallest() {
        int actual = comparate.getSmallest(List.of(5, 8, 9, 2, 1));
        int expected = 1;
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}