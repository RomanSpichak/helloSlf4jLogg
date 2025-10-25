package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSLF4J {
    
    private static final Logger log = LoggerFactory.getLogger(HelloSLF4J.class);

    public static void main(String[] args) {
        
        log.trace("Trace message (для діагностики найнижчого ріавня)");
        log.debug("Debug message (корисно під час розробки)");
        log.info("Hello, SLF4JJ + Logback");
        log.warn("Warning message (щось варте уваги)");
        log.error("Error message (помилка)");
    }
}
