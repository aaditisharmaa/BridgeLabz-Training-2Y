import java.util.*;
import java.io.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", ""); // Remove punctuation

        String[] words = text.split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies: " + freqMap);
    }
}
