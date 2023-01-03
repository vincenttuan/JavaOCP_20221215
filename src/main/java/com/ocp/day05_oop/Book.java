package com.ocp.day05_oop;

// 描述一本書即有那些資料?
public class Book {
    String title; // 名稱
    private int price = 200; // 價格
    private int pages = 1; // 頁數
    String authorName; // 作者姓名
    private int authorAge = 18; // 作者年齡
    
    public void setPrice(int price) {
        if(price > 200) {
            this.price = price;
        }
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void setPages(int pages) {
        if(pages > 1) {
            this.pages = pages;
        }
    }
    
    public void setAuthorAge(int age) {
        if(age > 18) {
            this.authorAge = age;
        }
    }
    
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", price=" + price + ", pages=" + pages + ", authorName=" + authorName + ", authorAge=" + authorAge + '}';
    }
    
    
}


