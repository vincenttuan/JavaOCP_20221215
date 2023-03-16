package com.ocp.day23_io;

import java.io.File;

public class CreateFile {
    
    public static void main(String[] args) {
        // 建立檔案 news.txt
        File file = new File("src/main/java/com/ocp/day23_io/files/news.txt");
        if(file.exists()) {
            System.out.println(file + "檔案已經存在");
        } else {
            try {
                boolean success = file.createNewFile();
                System.out.println(file + "建立成功: " + success);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }
    
}
