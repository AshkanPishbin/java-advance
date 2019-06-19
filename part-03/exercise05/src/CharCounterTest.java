import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharCounterTest {
    private CharCounter charCounter = new CharCounter();

    @ParameterizedTest
    @CsvSource({
            "1 @# %r23,4",
            "ww@#sx 890 &  # % de,9",
            "@yghD H H J G@9kj,11"
    })
    void countCharacters(String sentence, Integer expected) {
        Integer actual = charCounter.countCharacters(sentence);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}