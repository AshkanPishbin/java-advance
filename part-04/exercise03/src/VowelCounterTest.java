import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VowelCounterTest {
    private VowelCounter vowelCounter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "'',0",
            "1,0",
            "$%,0",
            "a,1",
            "A,1",
            "a1,1",
            "1a,1",
            "1a1,1",
            "aaaaaaaaxgxfruie$57897iuunbgf,14",
            "ADFCGREZDJNJJIUY^%$#^%%^<Ooeadqoie,11",
            "12345aAEeUuIiOO,10",
            "12325678!@#$%^&,0",
    })
    void countVowel(String sentece, int expected) {
        int actual = vowelCounter.countVowel(sentece);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}