import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionCalculatorTest {
    private SubtractionCalculator subtractionCalculator = new SubtractionCalculator();

    static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(3, 2, 1),
                Arguments.of(1, 2, -1),
                Arguments.of(3, 0, 3),
                Arguments.of(-3, 2, -5),
                Arguments.of(3, -2, 5),
                Arguments.of(0, 0, 0),
                Arguments.of(0, 2, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void subtract(double number1, double number2, double expected) {
        Double actual = subtractionCalculator.subtract(number1, number2);
        assertEquals(expected, actual);
    }
}
