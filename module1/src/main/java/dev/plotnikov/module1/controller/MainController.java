package dev.plotnikov.module1.controller;

import dev.plotnikov.module1.client.HelloApi;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/serviceA")
public class MainController {

    private final HelloApi helloApi;

    public MainController(HelloApi helloApi) {
        this.helloApi = helloApi;
    }


    @GetMapping("/hello")
    public String get() {
        return helloApi.getHello();
    }
}
