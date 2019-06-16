import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PeekTest {
    private Peek peek = new Peek();

    @Test
    void testThatPeekReturnsLastElement() {
        List<String> elements = List.of("a", "b", "c", "d", "f");
        String actual = peek.peek(elements);
        String expected = "f";
        assertEquals(expected, actual);
    }

    @Test
    void testThatPeekFailsOnAnEmptyList() {
        List<String> elements = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> peek.peek(elements));
    }
}
