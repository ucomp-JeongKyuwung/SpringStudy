package com.example.restTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template="Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static final String whereTo = "집이 없어 어쩌지 어디로 가야하지? %s!";
    private static final String iWant = "그 집 팔지마 %s";

    @GetMapping("/hithere")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/home")
    public MyHome myHome(@RequestParam(value="home", defaultValue = "난 Home Less")String home){
        return new MyHome(counter.incrementAndGet(), String.format(whereTo, home));
    }

    @GetMapping("/back")
    public Back back(@RequestParam(value="back", defaultValue = "돌아가고 싶어")String want){
        return new Back(counter.decrementAndGet(), String.format(iWant, want));
    }


}
