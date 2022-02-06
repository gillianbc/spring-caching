package com.example.servingwebcontent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Cacheable
public class GreetingService {
    public String extendName(String name) {
        System.out.println("In service");
        return name + "-Pig";
    }

}
