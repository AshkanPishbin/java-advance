import java.util.List;
import java.util.Optional;

public class MyQueue {
    public Optional<String> peep(List<String> elements) {
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        }
        return Optional.empty();
    }

    public List<String> poll(List<String> elements) {
        if (elements.size() > 0) {
            String element = elements.get(0);
            elements.remove(element);
        }
        return elements;
    }

    public List<String> push(List<String> elements, String element) {
        elements.add(element);
        return elements;
    }
}

