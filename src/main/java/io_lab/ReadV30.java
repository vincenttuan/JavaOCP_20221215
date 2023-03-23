package io_lab;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadV30 {
    
    public static void main(String[] args) throws Exception {
        Map<String, Map<String, String>> tseMap = getMap("T30V.TSE");
        Map<String, Map<String, String>> otcMap = getMap("T30V.OTC");
        
        Map<String, Map<String, String>> allMap = new TreeMap<>();
        allMap.putAll(tseMap);
        allMap.putAll(otcMap);
        
        System.out.println(allMap.get("2330"));
        System.out.println(allMap.get("00687B"));
        
    }
    
    private static Map<String, Map<String, String>> getMap(String fileName) throws Exception {
        File file = new File("src/main/java/io_lab/" + fileName);
        byte[] bytes = Files.readAllBytes(file.toPath());
        System.out.println(bytes.length);
        Charset charset = Charset.forName("BIG5");
        int blockSize = 100;
        Map<String, Map<String, String>> myMap = new TreeMap<>();
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
            
            myMap.put(map.get("STOCK-NO"), map);
        }
        
        return myMap;
    }
    
}
