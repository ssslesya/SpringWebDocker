package ru.olesya.SpringWebDocker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWorldControllerTest {
    @Autowired
    private HelloWorldController controller;

    @Test
    void hello() {
        String body = controller.hello().getBody();
        assertEquals("Hello, world!", body);
    }
}