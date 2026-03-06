import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String,Integer> wordCount = new LinkedHashMap<>();

        while(sc.hasNext()){
            String word = sc.next();
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}