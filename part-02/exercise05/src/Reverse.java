import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
    public List<Integer> reverse(List<Integer> elements) {
        List<Integer> reversed = elements.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        return reversed;
    }
}

//        List<Integer> newElements = new ArrayList<>();
//        int lastPosition = elements.size() - 1;
//        for (int position = lastPosition; position >= 0; position--) {
//            Integer number = elements.get(position);
//            newElements.add(number);
//        }
//        return newElements;
//    }
//  }