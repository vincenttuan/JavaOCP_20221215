package com.ocp.day12;

public class Pen {
    private String color;
    private int price;

    public Pen() {
    }

    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }
    
    // 覆寫 equals()
    @Override
    public boolean equals(Object obj) {
        Pen pen2 = (Pen)obj;
        if(color.equals(pen2.color) && price == pen2.price) {
            return true;
        } else {
            return false;
        }
    }
    
    // 覆寫 hashCode

    @Override
    public int hashCode() {
        return 7 * 13 * price + color.hashCode();
    }
    
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" + "color=" + color + ", price=" + price + '}';
    }
    
    
    
}
