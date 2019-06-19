import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SplitterTest {
    private Splitter splitter = new Splitter();

    @Test
    void splitNumber() {
        List<Integer> actual = splitter.splitNumber(14578);
        List<Integer> expected = List.of(1, 4, 5, 7, 8);
        Assertions.assertEquals(actual, expected);
    }
}