package com.electricity.system.src.models;

public class Admin {
    private int id;
    private String username;
    private String password;

    // Constructors
    public Admin() {}

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
