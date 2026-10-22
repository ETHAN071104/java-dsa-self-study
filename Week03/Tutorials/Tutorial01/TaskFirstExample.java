import java.util.ArrayDeque;
import java.util.Queue;

public class TaskFirstExample {
    public static void main(String[] args) {
        Queue<String> requests = new ArrayDeque<>();
        requests.offer("first");
        requests.offer("second");
        requests.offer("third");

        String nextRequest;
        while ((nextRequest = requests.poll()) != null) {
            System.out.println("Processing " + nextRequest);
        }
        System.out.println("Desk empty: " + requests.isEmpty());
    }
}
