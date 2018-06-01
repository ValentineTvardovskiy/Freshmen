package com.company;

public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[Name = "  + this.name + "]";
    }
}
