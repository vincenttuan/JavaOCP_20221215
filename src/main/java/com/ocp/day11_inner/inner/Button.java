// 一般型內部類別
package com.ocp.day11_inner.inner;
// 外部類別
public class Button {
    int x = 777;
    // 內部類別
    public class Click {
        int x = 77;
        // 按下之後要做的事
        public void action() {
            int x = 7;
            System.out.println("Button 被按了一下");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Button.this.x);
        }
    }
}
