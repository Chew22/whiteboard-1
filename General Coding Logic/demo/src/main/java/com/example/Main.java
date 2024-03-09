package com.example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        // Problem 1: Sorting
        int[] numbers = {21, 400, 8, -3, 77, 99, -16, 55, 111, -36, 28};
        Problem1Sorting.bubbleSort(numbers);
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Problem 2: FizzBuzz
        System.out.println("FizzBuzz:");
        Problem2FizzBuzz.fizzBuzz();

        // Problem 3: Fibonacci
        int n = 50; // Number of Fibonacci sequence elements to generate
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(Problem3Fibonacci.fibonacci(i) + " ");
        }
        
        // Problem 4: Intersection
        List<Integer> list1 = List.of(4, 5, 2, 3, 1, 6);
        List<Integer> list2 = List.of(8, 7, 6, 9, 4, 5);

        List<Integer> intersection = Problem4Intersection.findIntersection(list1, list2);
        System.out.println("Intersection:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Problem 5: Symmetric Difference
        List<Integer> list3 = List.of(4, 5, 2, 3, 1, 6);
        List<Integer> list4 = List.of(8, 7, 6, 9, 4, 5);

        List<Integer> symmetricDifference = Problem5Symmetric.findSymmetricDifference(list3, list4);
        System.out.println("Symmetric Difference:");
        for (int num : symmetricDifference) {
            System.out.print(num + " ");
        }
        System.out.println();
    
        // Problem 6: Find Character with Maximum Occurrence
        String input = "Hello, world!";
        System.out.println("Character with Maximum Occurrence:");
        Problem6MaxOccurrence.findMaxOccurrence(input);
        
        // Problem 7: Square Root
        int x = 16; // Example input, change as needed
        System.out.println("Square root of " + x + ": " + Problem7SquareRoot.sqrt(x));

        // Problem 8: Anagram Checker
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + Problem8AnagramChecker.areAnagrams(str1, str2));

        //Problem 9: Node Path Existence
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('A', Arrays.asList('B'));
        graph.put('B', Arrays.asList('D', 'A'));
        graph.put('C', Arrays.asList('D'));
        graph.put('D', Arrays.asList('B'));
        graph.put('E', Arrays.asList('F'));
        graph.put('F', Arrays.asList('B'));
        Problem9NodePathExistence.setGraph(graph);

        // Problem 1: Node Path Existence
        char start1 = 'D', end1 = 'B';
        System.out.println("Does path exist between " + start1 + " and " + end1 + "? " + Problem9NodePathExistence.doesPathExist(start1, end1));

        char start2 = 'F', end2 = 'A';
        System.out.println("Does path exist between " + start2 + " and " + end2 + "? " + Problem9NodePathExistence.doesPathExist(start2, end2));

        char start3 = 'G', end3 = 'C';
        System.out.println("Does path exist between " + start3 + " and " + end3 + "? " + Problem9NodePathExistence.doesPathExist(start3, end3));

        char start4 = 'E', end4 = 'D';
        System.out.println("Does path exist between " + start4 + " and " + end4 + "? " + Problem9NodePathExistence.doesPathExist(start4, end4));

        // Problem 2: Shortest Path
        List<Character> shortestPath = Problem9NodePathExistence.shortestPath(start4, end4);
        if (!shortestPath.isEmpty()) {
            System.out.println("Shortest path between " + start4 + " and " + end4 + ": " + shortestPath);
        } else {
            System.out.println("No path exists between " + start4 + " and " + end4);
        }
    }
        
}
