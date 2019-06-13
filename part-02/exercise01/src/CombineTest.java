import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombineTest {
    private Combine combine = new Combine();

    static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        List.of(),
                        List.of()),
                Arguments.of(
                        List.of(),
                        List.of("a", "b", "c"),
                        List.of("a", "b", "c")),
                Arguments.of(
                        List.of("a", "b", "c"),
                        List.of(),
                        List.of("a", "b", "c")),
                Arguments.of(
                        List.of("a", "b", "c"),
                        List.of("a"),
                        List.of("a", "a", "b", "c"))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void combine(List<String> element1, List<String> element2, List<String> expected) {
        List<String> actual = combine.combine(element1, element2);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}