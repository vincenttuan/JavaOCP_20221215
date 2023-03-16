package com.ocp.day23_io;

import com.fasterxml.jackson.core.io.UTF32Reader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderDemo {
    // 讀取檔案內容
    public static void main(String[] args) {
        File file = new File("src/main/java/com/ocp/day23_io/files/news.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file, Charset.forName("UTF-8")); // 開啟檔案, 準備讀取
            // 逐字讀取
            while (true) {                
                int word = fr.read();
                if(word == -1) {
                    break;
                }
                System.out.print((char)word);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if(fr != null) {
                try {
                    fr.close(); // 關閉檔案
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
