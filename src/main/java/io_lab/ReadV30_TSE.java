package io_lab;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class ReadV30_TSE {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/io_lab/T30V.TSE");
        byte[] bytes = Files.readAllBytes(file.toPath());
        System.out.println(bytes.length);
        Charset charset = Charset.forName("BIG5");
        
        byte[] block1 = new byte[100];
        System.arraycopy(bytes, 0, block1, 0, 100);
        System.out.println(new String(block1));
        
        byte[] block2 = new byte[100];
        System.arraycopy(bytes, 100, block2, 0, 100);
        System.out.println(new String(block2));
        
        
        
    }
}
