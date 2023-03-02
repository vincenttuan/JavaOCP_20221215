package com.ocp.day19_exception;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            boolean isPass = login("admin", "1234");
            System.out.printf("登入資訊: %b\n", isPass);
        } catch(LoginFailException e) {
            System.out.println("登入資訊: false");
            System.out.println("登入錯誤訊息 = " + e.getMessage());
            e.howToDo();
        }
        
        try {
            boolean isPass2 = login("admin2", "2222");
            System.out.printf("登入資訊: %b\n", isPass2);
        } catch(LoginFailException e) {
            System.out.println("登入資訊: false");
            System.out.println("登入錯誤訊息 = " + e.getMessage());
            e.howToDo();
        }
        
    }
    
    // 登入驗證
    public static boolean login(String username, String password) throws LoginFailException {
        if (username.equals("admin") && password.equals("1234")) {
            return true;
        } else {
            // ...
            LoginFailException e = new LoginFailException("您的使用者名稱或密碼不正確");
            throw e; // 將例外拋出
        }
    }
}
