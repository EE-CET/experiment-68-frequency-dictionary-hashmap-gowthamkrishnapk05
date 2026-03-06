import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LinkedHashMap preserves the order in which keys are first inserted
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();

        // Read all words from the input
        while (sc.hasNext()) {
            String word = sc.next();
            // Increment the count or set to 1 if it's new
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the results (will now follow the input order)
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}