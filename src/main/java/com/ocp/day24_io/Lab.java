package com.ocp.day24_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 將一個文件中的單詞按字母順序排序並寫入另一個文件。
 * input.txt
   Mary
   John
   Hello
 * outpu.txt
   Hello
   John
   Mary
*/
public class Lab {
    public static void main(String[] args) {
        File source = new File("src/main/java/com/ocp/day24_io/source/input.txt"); // 資料來源
        File dist = new File("src/main/java/com/ocp/day24_io/dest/output.txt"); // 目的地
        
        try(BufferedReader br = new BufferedReader(new FileReader(source));
            FileWriter fw = new FileWriter(dist)){
            
            List<String> list = new ArrayList<>();
            String line = null;
            while ((line = br.readLine()) != null) {                
                list.add(line);
            }
            System.out.println("排序前: " +list);
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
            System.out.println("排序後: " + list);
            // 寫入檔案
            for(String row : list) {
                fw.write(row + "\n");
            }
            System.out.println("寫入成功!");
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
