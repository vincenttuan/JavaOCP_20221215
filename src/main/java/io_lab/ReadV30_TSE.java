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
        int blockSize = 100;
        for(int i = 0, len = bytes.length/blockSize ; i < len; i++) {
            byte[] block = new byte[blockSize];
            System.arraycopy(bytes, i*blockSize, block, 0, blockSize);
            System.out.println(new String(block, charset));
        }
        
    }
}
