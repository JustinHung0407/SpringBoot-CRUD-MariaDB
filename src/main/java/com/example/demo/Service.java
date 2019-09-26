package com.example.demo;
import com.example.demo.model.*;

public class Service {
	private Long id;
    private String name;
    private String email;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:" + id + ",");
        sb.append("name:" + name + ",");
        sb.append("address:" + email);
        return sb.toString();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // getters and setters...
}
