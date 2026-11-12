package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-dev")
public class SoftwareDevelopersController {

    @GetMapping
    public List<SoftwareDevelopers> getSoftwareDevs() {
        return List.of(
            new SoftwareDevelopers(
                    1,
                    "Makwa",
                    "mkwa@example.com",
                    List.of("HTML", "JavaScript", "Java")
            ),
            new SoftwareDevelopers(
                    2,
                    "Lona",
                    "lona@example.com",
                    List.of("HTML", "JavaScript", "Java")
            )
        );
    }
}
