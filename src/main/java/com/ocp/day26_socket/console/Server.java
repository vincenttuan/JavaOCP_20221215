package com.ocp.day26_socket.console;

// Socket Server

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        int port = 5555;
        String serverIP = "localhost";
        
        // 1. 建立 SocketServer
        ServerSocket serverSocket = new ServerSocket(port);
        // 2. 等待 Client Socket 的連線
        System.out.println("等待 Client 的連線");
        Socket socket = serverSocket.accept();
        System.out.printf("Client 端已連入: %s:%d\n", socket.getInetAddress(), socket.getPort());
        // 3. 建立 I/O
        ObjectInputStream ios = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        // 4. 收 Client 端傳來的訊息
        while (true) {            
            // 5. 讀取訊息
            String message = (String)ios.readObject();
            if(message.equalsIgnoreCase("exit")) { // 下達離開指令
                System.out.println("Client: 下達離開命令, ServerSocket關閉");
                serverSocket.close();
                break;
            } else { // 接收 client 端的訊息
                System.out.printf("Client: %s\n", message);
            }
        }
        System.out.println("ServerSocket 結束");
        
    }
}
