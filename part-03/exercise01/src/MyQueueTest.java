import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyQueueTest {
    private MyQueue myQueue = new MyQueue();
    private final List<String> emptyList = new ArrayList<>();
    private final List<String> listWithElements = List.of("a", "b", "c", "d");

    @Test
    void testThatPeepReturnsAnElement() {
        Optional<String> element = myQueue.peep(listWithElements);
        assertTrue(element.isPresent());
        String actual = element.get();
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    void testThatPeepReturnsAnEmptyOptional() {
        Optional<String> element = myQueue.peep(emptyList);
        assertTrue(element.isEmpty());
    }

    @Test
    void testThatPollReturnsAListOfElements() {
        List<String> immutableList = List.of("a", "b", "c", "d");
        List<String> mutableList = new ArrayList<>(immutableList);
        List<String> actual = myQueue.poll(mutableList);
        List<String> expected = (List.of("b", "c", "d"));
        assertEquals(expected, actual);
    }
}