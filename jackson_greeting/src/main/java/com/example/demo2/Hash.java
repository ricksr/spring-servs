package com.example.demo2;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    private static Map<String, Long> mp = new HashMap<>();

    public Hash(String a, long b) {
        mp.put(a, b);
    }

    public static Map<String, Long> getMp() {
        return mp;
    }
}
