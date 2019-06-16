import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PushTest {
private Push push =new Push();

    @Test
    void push() {
        List<String> immutableList = List.of("a", "b", "c", "d");
        List<String> mutableList = new ArrayList<>(immutableList);
        String element="z";
        List<String> actual = push.push(mutableList,element);
        List<String> expected =(List.of("a", "b", "c", "d","z"));
        Assertions.assertEquals(expected,actual);
    }
}