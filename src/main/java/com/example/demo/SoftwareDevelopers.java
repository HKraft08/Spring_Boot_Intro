package com.example.demo;

import java.util.List;

public class SoftwareDevelopers {

    private int id;
    private String name;
    private String email;
    private List<String> techStack;

    SoftwareDevelopers(int id, String name, String email, List<String> techStack) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.techStack = techStack;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public List<String> getTechStack() {
        return this.techStack;
    }
}
