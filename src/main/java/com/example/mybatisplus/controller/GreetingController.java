package com.example.mybatisplus.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.mybatisplus.bean.BaseResponse;
import com.example.mybatisplus.bean.GreetingRequest;
import com.example.mybatisplus.bean.GreetingResponse;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting1")
    public BaseResponse greeting1(@RequestBody GreetingRequest request) {
        return BaseResponse.success("", new GreetingResponse(counter.incrementAndGet(), String.format(template, request.getMsg())));
    }

}
