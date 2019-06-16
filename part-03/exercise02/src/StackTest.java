import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {
    private Stack stack = new Stack();

    @Test
    void peek() {
        List<String> elements = List.of("a", "b", "c", "d", "f");
        String actual = stack.peek(elements);
        String expected = "f";
        assertEquals(expected, actual);
    }

    @Test
    void pop() {
        List<String> immutableList = List.of("n", "b", "a", "f");
        List<String> mutableList = new ArrayList<>(immutableList);
        List<String> actual = stack.pop(mutableList);
        List<String> expected = (List.of("n", "b", "a"));
        assertEquals(expected, actual);
    }

    @Test
    void push() {
        List<String> immutableList = List.of("a", "b", "c", "d");
        List<String> mutableList = new ArrayList<>(immutableList);
        String element = "z";
        List<String> actual = stack.push(mutableList, element);
        List<String> expected = (List.of("a", "b", "c", "d", "z"));
        assertEquals(expected, actual);
    }
}