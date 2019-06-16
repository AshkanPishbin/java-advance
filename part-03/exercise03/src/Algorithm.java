import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    public List<Integer> findAlgorithm(List<Integer> numbers, Integer numberSize) {
        List<Integer> numberOfSequence = new ArrayList<>();
        for (int number = 0; number < numberSize; number++) {
            if (number % 2 == 0) {
                numberOfSequence.add(number);
            }
            if (number % 2 == 1) {
                int number2 = number * -1;
                numberOfSequence.add(number2);
            }
        }
        return numberOfSequence;
    }
}

