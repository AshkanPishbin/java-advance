import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ConcatenateTest {
    private Concatenate concatenate = new Concatenate();

    static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        List.of("Table", "Chair", "Lamp"),
                        List.of("Table", "Chair", "Lamp")),
                Arguments.of(
                        List.of("Dog", "Cat", "Bird"),
                        List.of(),
                        List.of("Dog", "Cat", "Bird")),
                Arguments.of(
                        List.of(),
                        List.of("Table", "Chair", "Lamp"),
                        List.of("Table", "Chair", "Lamp")),
                Arguments.of(
                        List.of("Dog", "Cat", "Bird"),
                        List.of("Table", "Chair", "Lamp"),
                        List.of("Dog", "Cat", "Bird", "Table", "Chair", "Lamp"))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void concatenate(List<String> elements1, List<String> elements2, List<String> expected) {
        List<String> actual = concatenate.concatenate(elements1, elements2);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}