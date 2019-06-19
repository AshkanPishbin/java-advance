import java.util.Arrays;
import java.util.List;

public class CharCounter {

    public int countCharacters(String sentence) {

        if (sentence.contains(" ")) {
            sentence = sentence.replaceAll(" ", "");
        }
        List<String> symbols = Arrays.asList(
                "@",
                "#",
                "\\$",
                "%",
                "\\^",
                "&",
                "\\*",
                "(",
                ")",
                ":",
                "?",
                ">",
                "<",
                "'");
        for (String symbol : symbols) {
            if (sentence.contains(symbol)) {
                sentence = sentence.replaceAll(symbol, "");
            }
        }
        return sentence.length();
    }
}




