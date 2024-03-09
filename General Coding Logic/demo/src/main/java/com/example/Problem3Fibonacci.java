package com.example;

import java.util.HashMap;
import java.util.Map;

public class Problem3Fibonacci {
    static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        
    }

    public static int fibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result;
        if (n <= 1) {
            result = n;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        memo.put(n, result);
        return result;
    }
}
