package com.ocp.day19_exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        boolean isPass = login("admin", "1234");
        System.out.printf("登入資訊: %b\n", isPass);
        
        boolean isPass2 = login("admin2", "2222");
        System.out.printf("登入資訊: %b\n", isPass2);
        
    }
    
    // 登入驗證
    public static boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            return true;
        } else {
            return false;
        }
    }
}
