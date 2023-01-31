package com.ocp.day11_inner.static_inner;

public class ButtonTest {
    public static void main(String[] args) {
        Button button = new Button();
        Button.Click click1 = button.new Click();
        click1.action();
        //---------------------------------------------
        Button.Click click2 = new Button().new Click();
        click2.action();
        //---------------------------------------------
        Button.DblClick dblClick = new Button.DblClick();
        dblClick.action();
    }
}
