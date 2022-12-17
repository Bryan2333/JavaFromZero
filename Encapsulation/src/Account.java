public class Account {
    private String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public Account(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && 2 <= name.length() && name.length() <=4) {
            this.name = name;
        } else {
            System.out.println("您输入的名字过长！名字长度为2~4个字符");
            this.name = "无名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance <= 20) {
            System.out.println("余额必须大于20元! 默认为0元");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null) {
            if (password.length() == 6) {
                this.password = password;
            } else if (password.length() > 6) {
                System.out.println("密码必须是6位！默认密码: 123456");
                this.password = "123456";
            } else {
                System.out.println("密码必须是6位！默认密码: 123456");
                this.password = "123456";
            }
        }
    }
}
