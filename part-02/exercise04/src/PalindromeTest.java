import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeTest {
    private Palindrome palindrome = new Palindrome();

    @ParameterizedTest
    @CsvSource({"Ashkan,false",
            "Nurses run,true",
            "San Francisco, false",
            "madam,true"})
    void isPalindrome(String word, boolean expected) {
        boolean actual = palindrome.isPalindrome(word);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}