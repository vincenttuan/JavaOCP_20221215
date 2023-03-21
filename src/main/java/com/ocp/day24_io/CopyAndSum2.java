package com.ocp.day24_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class CopyAndSum2 {
    public static void main(String[] args) {
        File source = new File("src/main/java/com/ocp/day24_io/source/score2.txt"); // 資料來源
        File dist = new File("src/main/java/com/ocp/day24_io/dest/score2.txt"); // 目的地
        
        try(BufferedReader br = new BufferedReader(new FileReader(source));
            FileWriter fw = new FileWriter(dist)){
            
            String line = null;
            while ((line = br.readLine()) != null) { // 逐行讀取, 若讀到 null 表示已經讀完, 跳離迴圈                
                // 透過 split(",") 來拆分字串
                String[] values = line.split(",");
                int sum = Arrays.stream(values).mapToInt(Integer::parseInt).sum();
                // 準備待寫入的字串
                String result = line + "," + sum;
                // 將字串寫入到檔案中
                fw.write(result + "\n");
                System.out.println("Copy And Sum OK!");
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
