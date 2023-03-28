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
        int port = 5000;
        ServerSocket serverSocket = new ServerSocket(port);
        System.err.println("Web Server port : " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("有 Client 連入");

            // Socket I/O
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
                if (s.isEmpty()) {
                    break;
                }
            }
            
            out.write("HTTP/1.0 200 OK\r\n");
            out.write("Date: Fri, 31 Dec 2022 23:59:59 GMT\r\n");
            out.write("Server: Apache/0.8.4\r\n");
            out.write("Content-Type: text/html\r\n");
            out.write("Content-Length: 59\r\n");
            out.write("Expires: Sat, 01 Jan 2022 00:59:59 GMT\r\n");
            out.write("Last-modified: Fri, 09 Aug 2022 14:21:40 GMT\r\n");
            out.write("\r\n");
            out.write("<TITLE>Exemple</TITLE>");
            out.write("<P>Ceci est une page d'exemple.</P>");

            System.err.println("離開結束");
            out.close();
            in.close();
            clientSocket.close();
        }
    }
}
