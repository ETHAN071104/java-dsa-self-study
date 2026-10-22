import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskFirstExample {
    private static class ScoreEntry {
        private final String name;
        private final int score;

        ScoreEntry(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        List<ScoreEntry> scores = new ArrayList<>();
        scores.add(new ScoreEntry("Ada", 78));
        scores.add(new ScoreEntry("Bo", 49));
        scores.add(new ScoreEntry("Cy", 62));

        scores.sort((first, second) -> Integer.compare(first.score, second.score));

        System.out.println("Sorted by score:");
        for (ScoreEntry entry : scores) {
            System.out.println(entry.name + ": " + entry.score);
        }
    }
}
