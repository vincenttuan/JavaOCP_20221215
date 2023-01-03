package com.ocp.day05_oop;

// 描述一本書即有那些資料?
public class Book {
    String title; // 名稱
    int price; // 價格
    int pages; // 頁數
    String authorName; // 作者姓名
    int authorAge; // 作者年齡

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", price=" + price + ", pages=" + pages + ", authorName=" + authorName + ", authorAge=" + authorAge + '}';
    }
    
    
}


