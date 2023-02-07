package com.ocp.day13_list;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

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
        boolean ok = false;
        Set<Integer> history = new LinkedHashSet<>(); // 歷史紀錄
        while (!names.isEmpty()) {            
            String name = names.poll();
            
            int guess = 0;
            outer_loop:
            while (true) {                
                guess = random.nextInt(9) + 1; // 1~9
                // 比對歷史紀錄
                for(int value : history) {
                    if(guess == value) {
                       continue outer_loop; // 重猜
                    }
                }
                history.add(guess); // 將所猜的資料放到歷史紀錄中
                break;
            }
            
            ok = (guess == ans);
            System.out.printf("%s 猜 %d 是否答對: %b\n", name, guess, ok);
            if(ok) {
                System.out.printf("答案是: %d 恭喜 %s 猜對了\n", ans, name);
                break;
            }
        }
        
        if(!ok) {
            System.out.println("無人答對");
        }
        
        System.out.println("Game over!");
        
    }
}
