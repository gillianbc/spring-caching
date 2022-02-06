package com.example.servingwebcontent;

import org.springframework.cache.annotation.Cacheable;


public interface GreetingService {
    @Cacheable("sample")
    String extendName(String name);
}
