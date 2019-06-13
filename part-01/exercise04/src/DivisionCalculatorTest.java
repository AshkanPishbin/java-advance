import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionCalculatorTest {
    private DivisionCalculator divisionCalculator = new DivisionCalculator();

    static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(1, 0, Double.POSITIVE_INFINITY),
                Arguments.of(-1, 0, Double.NEGATIVE_INFINITY),
                Arguments.of(0, 0, Double.POSITIVE_INFINITY),
                Arguments.of(0, 1, 0),
                Arguments.of(0, -1, 0),
                Arguments.of(1, 1, 1),
                Arguments.of(-1, 1, -1),
                Arguments.of(1, -1, -1),
                Arguments.of(-1, -1, 1),
                Arguments.of(2, 2, 1),
                Arguments.of(4, 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void divide(double number1, double number2, double expected) {
        double actual = divisionCalculator.divide(number1, number2);
        assertEquals(expected, actual);
    }
}
