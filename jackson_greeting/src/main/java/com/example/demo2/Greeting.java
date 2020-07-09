package com.example.demo2;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;


public class Greeting {
    private final long id;
    private final String content;
    private static Map<String, Long> mp = new HashMap<>();


    public Map<String, Long> show() {
        return mp;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        mp.put(content, id);
        System.out.println(mp);
    }


    public long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
    public Map<String, Long> getMp() { return mp; }
}