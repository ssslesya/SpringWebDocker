package ru.olesya.SpringWebDocker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello, world!", HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity<HttpStatus> health() {
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
