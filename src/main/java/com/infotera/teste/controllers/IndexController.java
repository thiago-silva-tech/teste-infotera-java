package com.infotera.teste.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("indexController")
@RequestScoped
public class IndexController {
    private String message = "Welcome to the Index Page!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
