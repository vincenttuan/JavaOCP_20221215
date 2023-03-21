package com.ocp.day24_io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class ImageDownloader {
    public static void main(String[] args) throws Exception {
        String urlString = "https://imageio.forbes.com/specials-images/imageserve/5d35eacaf1176b0008974b54/2020-Chevrolet-Corvette-Stingray/0x0.jpg";
        URL url = new URL(urlString);
        try(InputStream is = url.openStream(); // 讀取網路串流
            FileOutputStream fos = new FileOutputStream("src/main/java/com/ocp/day24_io/car.jpg");) { // 輸出串流
            // 將讀取到的網路串流寫入到指定輸出串流
            is.transferTo(fos); 
            System.out.println("資料寫入完成");
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
