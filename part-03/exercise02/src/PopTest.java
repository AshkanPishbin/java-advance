import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PopTest {
    private Pop pop = new Pop();

    @Test
    void pop() {
        List<String> immutableList = List.of("n", "b", "a", "f");
        List<String> mutableList = new ArrayList<>(immutableList);
        List<String> actual = pop.pop(mutableList);
        List<String> expected = (List.of("n", "b", "a"));
        assertEquals(expected, actual);
    }

    @Test
    void testThatPopFailsOnAnEmptyList() {
        List<String> elements = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> pop.pop(elements));
    }
}
