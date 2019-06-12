import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumCalculatorTest {
    private SumCalculator sumCalculator = new SumCalculator();

    @ParameterizedTest
    @CsvSource({
            "2,2,4",
            "8,6,14",
            "12,6,18"
    })
    void calculate(Double number01, Double number02, Double expected) {
        Double actual = sumCalculator.calculate(number01, number02);
        Assertions.assertEquals(expected, actual);
    }
}