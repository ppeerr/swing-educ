package com.per.swing.hello;

import com.per.swing.dto.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingsController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(method = GET, path = "/greeting")
    public Greeting greeting(
            @RequestParam(value="name", defaultValue = "World") String name
    ) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


}
