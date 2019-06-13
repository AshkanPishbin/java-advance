import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    static Stream<Arguments> getArguments() {
        return Stream.of(
//                Arguments.of(-1, 0, "@", Double.NaN),
                Arguments.of(1, 0, "+", 1),
                Arguments.of(0, 1, "*", 0),
//                Arguments.of(-1, 0, "&", Double.NaN),
                Arguments.of(1, 0, "-", 1),
                Arguments.of(-1, 0, "$", Double.NaN),
//                Arguments.of(-1, 0, "-", -1),
                Arguments.of(1, 0, "/", Double.POSITIVE_INFINITY),
                Arguments.of(0, 1, "/", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void calculate(double number1, double number2, String symbol, double expected) {
        Double actual = calculator.calculate(number1, number2, symbol);
        assertEquals(expected, actual);
    }
}
