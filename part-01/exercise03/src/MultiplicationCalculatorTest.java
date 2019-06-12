import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationCalculatorTest {
    private MultiplicationCalculator multiplicationCalculator = new MultiplicationCalculator();

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1, 0, 0",
            "0, 1, 0",
            "1, 1, 1",
            "-1, 1, -1",
            "1, -1, -1",
            "-1, -1, 1",
            "1, 2, 2",
            "2, 1, 2",
            "4, 2, 8",
    })
    void multiply(double number1, double number2, double expected) {
        double actual = multiplicationCalculator.multiply(number1, number2);
        assertEquals(expected, actual);
    }

}