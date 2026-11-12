import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] words = line.split(" ");
        
        // 1. count each word into a Map<String, Integer>
        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        // 2. iterate the entries in alphabetical key order
        //    (walk a map with: for (Map.Entry<String, Integer> e : map.entrySet()))
        for (Map.Entry<String, Integer> e : wordCount.entrySet()) {
            // 3. print one line per word: "<word>: <count>"
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
