package com.ocp.day26_socket.console;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入Server IP(localhost): ");
        String serverIP = scanner.next();
        // 1. 建立 Socket 連線
        Socket socket = new Socket(serverIP, 5555);
        // 2. 建立 Socket I/O
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        while (true) {            
            // 3. 輸入要傳送的訊息
            System.out.print("請輸入要傳送的訊息: ");
            String message = scanner.next();
            // 4. 訊息送出
            oos.writeObject(message);
            // 5. 是否離開
            if(message.equalsIgnoreCase("exit")) {
                socket.close(); // socket 關閉
                break;
            }
        }
        System.out.println("Socket 關閉");
    }
    
    
}
