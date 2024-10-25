package dev.plotnikov.module2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/serviceB")
public class MainController {

    @GetMapping("/hello")
    public String get() {
        return "Hello from serviceB";
    }
}
