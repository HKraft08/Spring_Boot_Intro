package com.example.demo;

import java.util.List;

public record Student(int id, String firstName, String lastName, String email, List<String> courses) {
}
