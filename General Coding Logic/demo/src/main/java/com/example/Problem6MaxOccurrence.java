package com.example;

import java.util.HashMap;
import java.util.Map;

public class Problem6MaxOccurrence {
    public static void findMaxOccurrence(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("No characters found.");
            return;
        }

        // Remove whitespaces and punctuation, and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Count occurrences of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : cleanedInput.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum occurrence
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Character: '" + maxChar + "', Occurrence: " + maxCount);
    }
}
