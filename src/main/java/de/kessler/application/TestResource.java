package de.kessler.application;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Tag(name = "Test")
@RequestMapping(path = "api")
public class TestResource {

    @Operation
    @GetMapping(path = "test")
    public ResponseEntity<String> test() {
        System.out.println();
        return ResponseEntity.ok("Test");
    }
}
