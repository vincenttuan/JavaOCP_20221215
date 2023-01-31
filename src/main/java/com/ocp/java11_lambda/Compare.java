package com.ocp.java11_lambda;

@FunctionalInterface
public interface Compare {
    // 給二個數值例如: 15, 30 會得到 30
    int max(int x, int y);
}
