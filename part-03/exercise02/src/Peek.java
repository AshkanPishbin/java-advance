import java.util.List;

public class Peek {
    public String peek(List<String> elements) {
        if (elements.size() > 0) {
            String ele = elements.get(elements.size() - 1);
            return ele;
        }
        throw new IllegalArgumentException("The operator is not supported." + elements);
    }
}







