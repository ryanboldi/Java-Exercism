import java.util.HashMap;
import java.util.stream.IntStream;

class Scrabble {
    private final static HashMap<Integer, Integer> charToValue = new HashMap<Integer, Integer>(26);
    private final static String[] letters = {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};
    private final static int[] scores = {1, 2, 3, 4, 5, 8, 10};

    static{
        IntStream.range(0, scores.length)
            .forEach(i -> letters[i].chars().forEach(c -> charToValue.put(c, scores[i])));
    }

    private final int value;

    Scrabble(String word) {
        value = word.toUpperCase().chars().reduce(0, (tot, newCharNum) -> tot += charToValue.get(newCharNum));
    }

    int getScore() {
        return value;
    }

}
