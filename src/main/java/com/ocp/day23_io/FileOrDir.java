package com.ocp.day23_io;

import java.io.File;

public class FileOrDir {
    public static void main(String[] args) {
        // 判定指定路徑是檔案還是目錄
        File f1 = new File("src/main/java/com/ocp/day23_io/files");
        File f2 = new File("src/main/java/com/ocp/day23_io/files/news.txt");
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f1.isDirectory() : " + f1.isDirectory());
        System.out.println("f2.isDirectory() : " + f2.isDirectory());
        System.out.println("f1.isFile() : " + f1.isFile());
        System.out.println("f2.isFile() : " + f2.isFile());
    }
}
