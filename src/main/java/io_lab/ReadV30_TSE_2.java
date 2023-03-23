package io_lab;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadV30_TSE_2 {
    public static void main(String[] args) throws Exception {
        
        File file = new File("src/main/java/io_lab/T30V.TSE");
        byte[] bytes = Files.readAllBytes(file.toPath());
        System.out.println(bytes.length);
        Charset charset = Charset.forName("BIG5");
        int blockSize = 100;
        Map<String, Map<String, String>> tseMap = new TreeMap<>();
        for(int i = 0, len = bytes.length/blockSize ; i < len; i++) {
            byte[] block = new byte[blockSize];
            System.arraycopy(bytes, i*blockSize, block, 0, blockSize);
            // 0050  00132950000120900000108850020230322000000  1元大台灣50      00000000000000000010X0            
            String str = new String(block, charset);
            Map<String, String> map = new LinkedHashMap<>();
            map.put("STOCK-NO", str.substring(0, 6).trim());
            map.put("BULL-PRICE", str.substring(6, 15).trim());
            map.put("LDC-PRICE", str.substring(15, 24).trim());
            map.put("BEAR-PRICE", str.substring(24, 33).trim());
            
            tseMap.put(map.get("STOCK-NO"), map);
        }
        
        //System.out.println(tseMap);
        long begin = System.nanoTime();
        System.out.println(tseMap.get("2330").get("LDC-PRICE"));
        long end = System.nanoTime();
        double time = (end - begin) / Math.pow(10, 9);
        System.out.println("花費時間:" + new DecimalFormat("0.#########").format(time) + " 秒");
        //System.out.println(tseMap.get("0050"));
        
        
    }
}
