package com.exercise;

public class Exercise02 {
    public static void main(String[] args) {

        String name = "张三";
        String pwd = "123456";
        String email = "test@gmail.com";

        try {
            userRegister(name, pwd, email);
        } catch (RuntimeException e) {
            e.getMessage();
        }
    }

    public static void userRegister(String name, String pwd, String email) {

        if (name == null || pwd == null || email == null) {
            throw new RuntimeException("参数不能为空！");
        }

        //判断用户名
        if (!(2 <= name.length() && name.length() <= 4)) {
            throw new RuntimeException("用户名长度为2~4");
        }

        //判断密码
        if (!(pwd.length() == 6 && ifAllDigit(pwd))) {
            throw new RuntimeException("密码长度为6且全为数字！");
        }

        //判断电子邮箱
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱包含@和. 且@在.前面");
        }

        System.out.println("注册成功！");
    }

    //该方法用于判断密码是否全为数字
    public static boolean ifAllDigit(String pwd) {
        char[] passwdArr = pwd.toCharArray();
        boolean allDigit = true;
        for (char ch : passwdArr) {
            if (ch < '0' || ch > '9') {
                allDigit = false;
                break;
            }
        }
        return allDigit;
    }
}
