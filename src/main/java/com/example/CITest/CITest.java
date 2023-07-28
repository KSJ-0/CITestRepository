package com.example.CITest;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CITest {

    @GetMapping
    public String hello() {
        return "Hello World!!";
    }
}
