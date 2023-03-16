package com.ocp.day23_io;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {
    public static void main(String[] args) throws IOException {
        // 建立暫存檔
        File dir = new File("src/main/java/com/ocp/day23_io/files");
        File tempFile = File.createTempFile("temp", ".txt", dir);
        System.out.println("建立暫存檔成功: " + tempFile);
    }
}
