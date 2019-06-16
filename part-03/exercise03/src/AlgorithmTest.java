import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class AlgorithmTest {
    private Algorithm algorithm = new Algorithm();

    static Stream<Arguments> getArguments() {
        return Stream.of
                (Arguments.of(
                        List.of(0, -1, 2, -3),
                        7,
                        List.of(0, -1, 2, -3, 4, -5, 6)),
                        Arguments.of(
                                List.of(0, -1, 2, -3),
                                2,
                                List.of(0, -1)),
                        Arguments.of(
                                List.of(0, -1, 2, -3),
                                5,
                                List.of(0, -1, 2, -3, 4)),
                        Arguments.of(
                                List.of(0, -1, 2, -3),
                                9,
                                List.of(0, -1, 2, -3, 4, -5, 6, -7, 8))
                );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void findAlgorithm(List<Integer> numbers, Integer numberSize, List<Integer> expected) {
        List<Integer> actual = this.algorithm.findAlgorithm(numbers, numberSize);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}

