import java.util.List;

public class Pop {
    public List<String> pop(List<String> elements) {
        if (elements.size() > 0) {
            elements.remove(elements.size() - 1);
            return elements;
        }
        throw new IllegalArgumentException("The operator is not supported." + elements);
    }
}
