package com.example.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GreetingController {

    private static final String template = "Hello %s !";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        Map<String, Long> mp1 = new Hash(name, counter.incrementAndGet());

        Greeting use = new Greeting(counter.incrementAndGet(), String.format(template, name));
        Map<String, Long> mp = new HashMap<>();
        mp = use.show();
        System.out.println(mp);
        return use;
    }
}