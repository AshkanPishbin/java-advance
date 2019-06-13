import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Combine {
    public List<String> combine(List<String> element1, List<String> element2) {
        List<String> combine = new ArrayList<>();
        Queue<String> queue1 = new LinkedList<>(element1);
        Queue<String> queue2 = new LinkedList<>(element2);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            pollAnElement(queue1, combine);
            pollAnElement(queue2, combine);
        }
        return combine;
    }

    private void pollAnElement(Queue<String> queue, List<String> combine) {
        if (!queue.isEmpty()) {
            String peek1 = queue.poll();
            combine.add(peek1);
        }
    }
}
