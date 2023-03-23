package io_lab;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadV30_OTC_2 {
    public static void main(String[] args) throws Exception {
        
        File file = new File("src/main/java/io_lab/T30V.OTC");
        byte[] bytes = Files.readAllBytes(file.toPath());
        System.out.println(bytes.length);
        Charset charset = Charset.forName("BIG5");
        int blockSize = 100;
        Map<String, Map<String, String>> tseMap = new TreeMap<>();
        for(int i = 0, len = bytes.length/blockSize ; i < len; i++) {
            byte[] block = new byte[blockSize];
            System.arraycopy(bytes, i*blockSize, block, 0, blockSize);
            // 0050  00132950000120900000108850020230322000000  1元大台灣50      00000000000000000010X0            
            //String str = new String(block, charset);
            Map<String, String> map = new LinkedHashMap<>();
            
            byte[] stockNo = new byte[6];
            System.arraycopy(block, 0, stockNo, 0, 6);
            map.put("STOCK-NO", new String(stockNo, charset).trim());
            
            byte[] bullPrice = new byte[9];
            System.arraycopy(block, 6, bullPrice, 0, 9);
            map.put("BULL-PRICE", new String(bullPrice, charset).trim());
            
            byte[] ldcPrice = new byte[9];
            System.arraycopy(block, 15, ldcPrice, 0, 9);
            map.put("BULL-PRICE", new String(ldcPrice, charset).trim());
            
            byte[] bearPrice = new byte[9];
            System.arraycopy(block, 24, bearPrice, 0, 9);
            map.put("BEAR-PRICE", new String(bearPrice, charset).trim());
            
            byte[] stockName = new byte[16];
            System.arraycopy(block, 50, stockName, 0, 16);
            map.put("STOCK-NAME", new String(stockName, charset).trim());
            
            tseMap.put(map.get("STOCK-NO"), map);
        }
        
        //System.out.println(tseMap);
        long begin = System.nanoTime();
        System.out.println(tseMap.get("00687B").get("STOCK-NAME"));
        long end = System.nanoTime();
        double time = (end - begin) / Math.pow(10, 9);
        System.out.println("花費時間:" + new DecimalFormat("0.#########").format(time) + " 秒");
        //System.out.println(tseMap.get("0050"));
        
        
    }
}
