import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(15, "fizzBuzz"),
                Arguments.of(8, "8"),
                Arguments.of(3, "fizz"),
                Arguments.of(5, "buzz"),
                Arguments.of(30, "fizzBuzz")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void setFizzBuzz(Integer number, String expected) {
        String actual = fizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(actual, expected);
    }
}