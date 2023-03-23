package io_lab;

// 取得檔案的編碼方式

import java.io.FileInputStream;
import java.io.IOException;
import org.mozilla.universalchardet.UniversalDetector;

/*
<dependency>
    <groupId>com.github.albfernandez</groupId>
    <artifactId>juniversalchardet</artifactId>
    <version>2.0.0</version>
</dependency>
*/
public class FileEncodingDetector {
    
    public static void main(String[] args) {
        String fileName = "src/main/java/io_lab/T30V.TSE";
        byte[] buffer = new byte[4096];
        // 偵測檔案編碼
        UniversalDetector detector = new UniversalDetector();
        // 將檔案資料讀入
        try(FileInputStream fis = new FileInputStream(fileName)) {
            int byteRead;
            while ((byteRead = fis.read(buffer)) != -1 && !detector.isDone()) {                
                // 偵測處理
                detector.handleData(buffer, 0, byteRead);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        // 偵測結束
        detector.dataEnd();
        // 偵測結果
        String encoding = detector.getDetectedCharset();
        System.out.println("偵測結果: " + encoding);
        // 偵測重置
        detector.reset();
    }
    
}
