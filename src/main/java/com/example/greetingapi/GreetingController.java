package com.example.greetingapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";

    private final AtomicLong count = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(count.incrementAndGet(), String.format(template, "world"));
    }
    
    @GetMapping("/greeting/name")
    public Greeting greeting (@RequestParam(value = "Chamika", defaultValue = "world") String name) {
        return new Greeting(count.incrementAndGet(), String.format(template, name));
    }
}
