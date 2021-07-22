import java.util.Map;
import java.util.Map.Entry;

class Scrabble {
    //i'm sorry in advance.
    static Map<Character, Integer> values = Map.ofEntries(
        Map.entry('A', 1), Map.entry('E', 1), Map.entry('I', 1), Map.entry('O', 1), Map.entry('U', 1),
        Map.entry('L', 1), Map.entry('N', 1), Map.entry('R', 1), Map.entry('S', 1), Map.entry('T', 1),
        Map.entry('D', 2), Map.entry('G', 2),
        Map.entry('B', 3), Map.entry('C', 3), Map.entry('M', 3), Map.entry('P', 3),
        Map.entry('F', 4), Map.entry('H', 4), Map.entry('V', 4), Map.entry('W', 4), Map.entry('Y', 4),
        Map.entry('K', 5),
        Map.entry('J', 8), Map.entry('X', 8),
        Map.entry('Q', 10), Map.entry('Z', 10)
    );

    int value = 0;

    Scrabble(String word) {
        int sum = 0;

        for (int i = 0; i < word.length(); i++){
            sum += values.get(Character.toUpperCase(word.charAt(i)));
        }

        value = sum;
    }

    int getScore() {
        return value;
    }

}
