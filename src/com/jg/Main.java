package com.jg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<Integer, Integer> memo = new HashMap<>();

        System.out.println(fib(n, memo));
    }

    /**
     * Method with memoization for better performance
     * @param n
     * @param memo
     * @return the Nth fibonacci number
     */
    static int fib(int n, Map memo){
        if(n <= 2) return 1;
        if(memo.containsKey(n)) return (int)memo.get(n);

        memo.put(n,(fib(n - 1, memo) + fib(n - 2, memo)));
        return (int)memo.get(n);
    }
}