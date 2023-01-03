package com.ocp.day05_oop;

public class ReferenceBook {
    private String title; // 名稱
    private int price; // 價格
    private int pages; // 頁數
    private Author author;  // 作者

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    
    
    @Override
    public String toString() {
        return "ReferenceBook{" + "title=" + title + ", price=" + price + ", pages=" + pages + ", author=" + author + '}';
    }
    
    
    
}
