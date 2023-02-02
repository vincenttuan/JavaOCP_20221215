package com.ocp.day12;

public class Pen {
    private String color;
    private int name;

    public Pen() {
    }

    public Pen(String color, int name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{" + "color=" + color + ", name=" + name + '}';
    }
    
    
    
}
