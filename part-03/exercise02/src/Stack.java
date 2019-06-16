import java.util.List;

public class Stack {
    public String peek(List<String> elements) {
        String ele = elements.get(elements.size() - 1);
        return ele;
    }

    public List<String> pop(List<String> elements) {
        if (elements.size() > 0) {
            elements.remove(elements.size() - 1);
        }
        return elements;
    }

    public List<String> push(List<String> elements, String element) {
        elements.add(element);
        return elements;
    }
}

