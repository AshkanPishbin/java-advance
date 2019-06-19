import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Splitter {
    public List<Integer> splitNumber(Integer positivenumber) {
        String stringPositiveNumber = String.valueOf(positivenumber);
        List<Integer> convertedNumbers = new ArrayList<>();
        String[] splitted = stringPositiveNumber.split("");
        List<String> listSplitted = Arrays.asList(splitted);
        for (String element : listSplitted) {
            convertedNumbers.add((Integer.valueOf(element)));
        }
        return convertedNumbers;
    }
}
