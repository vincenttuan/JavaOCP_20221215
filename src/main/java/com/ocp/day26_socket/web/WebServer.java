package com.ocp.day26_socket.web;

// 利用 Socket 撰寫一個 WebServer

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class WebServer {
    public static void main(String[] args) throws Exception {
        WebServer webServer = new WebServer();
        webServer.start();
    }
    
    private void start() throws Exception {
        ServerSocket server;
        System.out.println("WebServer 啟動 on port 5000");
        server = new ServerSocket(5000);
        System.out.println("等待連線");
        while (true) {
            Socket socket = server.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "big5")), true);
            
            System.out.println("瀏覽器已經連進來了");
            System.out.println("Client data: " + br.readLine());
            
            // 回應 HTTP 文件結構
            // Part I HTTP 初始列
            out.println("HTTP/1.1 200 OK");
            // Part II HTTP 標頭
            out.println("Content-Type: text/html");
            out.println("Server: SocketWebServer");
            // 空白列
            System.out.println("");
            // Part III 內文本體
            out.println("<html><h1>現在時刻: " + new Date() + " </h1></html>");
            
        }
    }
}
