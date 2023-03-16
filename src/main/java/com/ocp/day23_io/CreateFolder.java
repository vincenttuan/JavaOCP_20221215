package com.ocp.day23_io;

import java.io.File;

public class CreateFolder {
    // 建立資料夾
    // 在 src/main/java/com/ocp/day23_io/ 下建立 files 資料夾
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day23_io/files"; // 路徑位置
        File file = new File(path);
        System.out.println(file.exists());
        if(file.exists()) { // 檢查路徑是否存在 ?
            System.out.print(file + "建立資料夾: ");
            boolean success = file.mkdir(); // 建立資料夾
            System.out.println(success);
        } else {
            System.out.println(file + "資料夾已存在");
        }
    }
}
