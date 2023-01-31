// 一般型內部類別
package com.ocp.day11_inner.inner;
// 外部類別
public class Button {
    // 內部類別
    public class Click {
        // 按下之後要做的事
        public void action() {
            System.out.println("Button 被按了一下");
        }
    }
}
