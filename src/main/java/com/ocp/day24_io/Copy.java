package com.ocp.day24_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Copy {
    public static void main(String[] args) {
        File source = new File("src/main/java/com/ocp/day24_io/source/news.txt"); // 資料來源
        File dist = new File("src/main/java/com/ocp/day24_io/dest/news.txt"); // 目的地
        
        try(FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(dist);) {
            
            fr.transferTo(fw); // 將檔案 copy 到目的地
            System.out.println("Copy OK !");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
