package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("api/v1/students")
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1,
                        "Thabang",
                        "Ngoetjana",
                        "thabang@example.com",
                        List.of("Java", "Node.js", "Express.js")
                ),
                new Student(
                        2,
                        "Moe",
                        "Sefanyetso",
                        "moe@example.com",
                        List.of("Java", "Algorithms")
                ),
                new Student(
                        3,
                        "Aisha",
                        "Khumalo",
                        "aisha@example.com",
                        List.of("C#", "Python", "Algorithms")
                )
        );
    }

    @RequestMapping("api/v1/students/{id}")
    @GetMapping
    public Student getStudentById(@PathVariable Integer id) {
        return getStudents()
                .stream()
                .filter(student -> student.id() == id)
                .findFirst()
                .orElse(null);
    }
}
