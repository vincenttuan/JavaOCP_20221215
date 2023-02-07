package com.ocp.day13_list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueTest2 {
    public static void main(String[] args) {
        Random random = new Random();
        int ans = random.nextInt(9) + 1; // 1~9
        
        Queue<String> names = new LinkedList<>();
        names.offer("John");
        names.offer("Mary");
        names.offer("Bob");
        names.offer("Alen");
        names.offer("Helen");
        
        while (!names.isEmpty()) {            
            String name = names.poll();
            int guess = random.nextInt(9) + 1; // 1~9
            boolean ok = (guess == ans);
            System.out.printf("%s 猜 %d 是否答對: %b\n", name, guess, ok);
            if(ok) {
                System.out.printf("答案是: %d 恭喜 %s 猜對了\n", ans, name);
                break;
            }
        }
        System.out.println("Game over!");
        
    }
}
