import java.util.ArrayList;
import java.util.List;

//Define the concatenate action that receives two collection of strings and returns
// one collection that is the concatenation of the first one and the second one.
public class Concatenate {
    public List<String> concatenate(List<String> elements1, List<String> elements2) {
        List<String> concatenate = new ArrayList<>();
        for (String element : elements1) {
            concatenate.add(element);
        }
        for (String element : elements2) {
            concatenate.add(element);
        }
        return concatenate;
    }
}
