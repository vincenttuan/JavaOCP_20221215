// 靜態內部類別
package com.ocp.day11_inner.static_inner;

// 外部類別
public class Button {
    // 一般內部類別
    class Click { // 點擊一下
        public void action() {
            System.out.println("按我一下");
        }
    }
    // 靜態(static)內部類別
    static class DblClick { // 雙擊二下
        public static void action() {
            System.out.println("按我點二下");
        }
    }
    
}
