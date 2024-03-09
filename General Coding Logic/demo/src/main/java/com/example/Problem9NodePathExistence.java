package com.example;

import java.util.*;

public class Problem9NodePathExistence {
    private static Map<Character, List<Character>> graph;

    public static boolean doesPathExist(char start, char end) {
        Set<Character> visited = new HashSet<>();
        return dfs(start, end, visited);
    }

    private static boolean dfs(char current, char end, Set<Character> visited) {
        if (current == end) {
            return true;
        }

        visited.add(current);
        List<Character> neighbors = graph.getOrDefault(current, new ArrayList<>());
        for (char neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, end, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<Character> shortestPath(char start, char end) {
        if (!doesPathExist(start, end)) {
            return new ArrayList<>();
        }

        Queue<List<Character>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(Arrays.asList(start)));

        while (!queue.isEmpty()) {
            List<Character> path = queue.poll();
            char current = path.get(path.size() - 1);

            if (current == end) {
                return path;
            }

            List<Character> neighbors = graph.getOrDefault(current, new ArrayList<>());
            for (char neighbor : neighbors) {
                if (!path.contains(neighbor)) {
                    List<Character> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.add(newPath);
                }
            }
        }

        return new ArrayList<>();
    }

    public static void setGraph(Map<Character, List<Character>> inputGraph) {
        graph = inputGraph;
    }
}
