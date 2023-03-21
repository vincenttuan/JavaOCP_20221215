package com.ocp.day24_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab2 {
    // 請問 source/mess.txt "美國" 字樣共有幾組 ?
    public static void main(String[] args) throws Exception {
        File source = new File("src/main/java/com/ocp/day24_io/source/mess.txt"); // 資料來源
        try(BufferedReader br = new BufferedReader(new FileReader(source, Charset.forName("UTF-8")))) {
            int count = 0;
            String target = "美國";
            Pattern pattern = Pattern.compile(target);
            String line = null;
            
            long begin = System.nanoTime();
            while ((line = br.readLine()) != null) {  
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {                    
                    count++;
                }
            }
            long end = System.nanoTime();
            System.out.printf("花費時間: %.3f 秒\n", (end - begin)/Math.pow(10, 9) );
            
            System.out.println(count);
            
            
        } catch (Exception e) {
        }
        
    }
}
