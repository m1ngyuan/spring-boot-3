package com.github.controller;


import com.github.pojo.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("demo")
public class CollectionController {

    @GetMapping("getData")
    @ResponseBody
    public Mono<Collection> getData() {
        return Mono.just(new Collection());
    }
}
