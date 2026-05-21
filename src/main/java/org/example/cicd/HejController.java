package org.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HejController {

    @GetMapping("/hej")
    public ResponseEntity<List<String>> getHej(){
        return ResponseEntity.ok(List.of("hej", "hvad så"));
    }
}
