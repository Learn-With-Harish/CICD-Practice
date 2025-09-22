package com.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}