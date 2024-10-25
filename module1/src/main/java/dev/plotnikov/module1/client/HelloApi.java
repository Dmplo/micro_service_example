package dev.plotnikov.module1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hello")
public interface HelloApi {

    @GetMapping
    String getHello();
}


