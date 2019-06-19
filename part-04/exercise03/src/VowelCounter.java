import java.util.List;

public class VowelCounter {
    public static final List<String> VOWELS =
            List.of("aeiouAEIOU".split(""));

    public int countVowel(String sentence) {
        int vowelsNumber = 0;
        String[] splittedSentence = sentence.split("");
        for (String letter : splittedSentence) {
            if (VOWELS.contains(letter)) {
                vowelsNumber++;
            }
        }
        return vowelsNumber;
    }
}


