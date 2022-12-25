package model;

/**
 * House对象表示一个房屋信息
 */
public class House {
    private int id; //编号
    private String owner; //房主
    private String phoneNum; //房主电话号码
    private String address; //房屋地址
    private double rent; //租金
    private String state; //状态（未出租/已出租）

    public House(int id, String owner, String phoneNum, String address, double rent, String state) {
        this.id = id;
        this.owner = owner;
        this.phoneNum = phoneNum;
        this.address = address;
        this.rent = rent; //
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  id + "\t\t" + owner + "\t\t" + phoneNum + "\t\t" + address + "\t\t" +
                rent + "\t\t" + state;
    }
}
