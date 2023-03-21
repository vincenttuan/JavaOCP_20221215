package com.ocp.day24_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CopyAndSum {
    public static void main(String[] args) {
        File source = new File("src/main/java/com/ocp/day24_io/source/score.txt"); // 資料來源
        File dist = new File("src/main/java/com/ocp/day24_io/dest/score.txt"); // 目的地
        
        try(BufferedReader br = new BufferedReader(new FileReader(source))){
            
            String line = null;
            while ((line = br.readLine()) != null) { // 逐行讀取, 若讀到 null 表示已經讀完, 跳離迴圈                
                System.out.print(line);
                // 透過 split(",") 來拆分字串
                String[] values = line.split(",");
                System.out.print(" values[0] = " + values[0]);
                System.out.println(" values[1] = " + values[1]);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
