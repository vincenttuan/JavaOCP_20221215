package com.ocp.day11_inner.inner;

public class ButtonTest {
    public static void main(String[] args) {
        
        Button button = new Button();
        Button.Click click = button.new Click();
        click.action();
        
    }
}
