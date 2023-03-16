package com.ocp.day23_io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderDemo2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/ocp/day23_io/files/news.txt");
        try(FileReader fr = new FileReader(file, Charset.forName("UTF-8"))) {
            while (true) {                
                int word = fr.read();
                if(word == -1) {
                    break;
                }
                System.out.print((char)word);
            }
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}
