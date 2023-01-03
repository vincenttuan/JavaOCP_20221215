package com.ocp.day05_oop;

// Pen 的 color (預設是 blue) 只能是 red, blue, black
// Pen 的 price (預設是 15) 必須介於 10~20 之間
public class Pen {
    private String color = "blue";
    private int price = 15;
    
    public void setPrice(int price) {
        if(price < 10) {
            this.price = 10;
        } else if(price > 20) {
            this.price = 20;
        } else { // 10 <= price <== 20 之間
            this.price = price;
        }
    }
    
    public void setColor(String color) {
        color = color.toLowerCase(); // 全部轉小寫
        /*
        if(color.equals("red") || color.equals("blue") || color.equals("black")) {
            this.color = color;
        }
        */
        switch (color) {
            case "red":
            case "blue":
            case "black":
                this.color = color;
        }
    }
    
    
}
