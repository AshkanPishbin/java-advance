import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    void reverseHasElements() {
        List<Integer> immutableList = List.of(1, 2, 2, 3, 4, 5, 6, 7);
        List<Integer> actual = reverse.reverse(immutableList);
        List<Integer> expected = List.of(7, 6, 5, 4, 3, 2, 2, 1);
        System.out.println(immutableList);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void reverseHasNoElements() {
        List<Integer> expected = List.of();
        List<Integer> actual = reverse.reverse(expected);
        assertEquals(expected, actual);
    }
}