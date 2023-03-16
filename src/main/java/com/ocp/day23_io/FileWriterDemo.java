package com.ocp.day23_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    // 將資料寫入
    public static void main(String[] args) {
        String words = "台積電創辦人張忠謀與「晶片戰爭」作者米勒（Chris Miller）今天在一場近1小時對談中，\n" +
                       "針對台灣關鍵優勢、晶片製造轉移成本以及國際局勢變化將如何影響半導體產業進行交流與討論。";
        File file = new File("src/main/java/com/ocp/day23_io/files/news.txt");
        try(FileWriter fw = new FileWriter(file)) {
            
            fw.write(words); // 將字串資料寫入到檔案中
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
