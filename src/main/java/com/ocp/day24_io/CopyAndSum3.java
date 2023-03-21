package com.ocp.day24_io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CopyAndSum3 {
    public static void main(String[] args) {
        Path source = Paths.get("src/main/java/com/ocp/day24_io/source/score2.txt"); // 資料來源
        Path dist = Paths.get("src/main/java/com/ocp/day24_io/dest/score2.csv"); // 目的地

        try {
            List<String> lines = Files.readAllLines(source);
            List<String> results = lines.stream().map(line -> {
                String[] values = line.split(",");
                IntSummaryStatistics statistics = Arrays.stream(values).mapToInt(Integer::parseInt).summaryStatistics();
                return line + "," + statistics.getSum() + "," + statistics.getAverage();
            }).collect(Collectors.toList());
            
            Files.write(dist, results, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            System.out.println("Copy And Sum OK!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
