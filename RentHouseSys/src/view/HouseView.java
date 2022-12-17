package view;

import model.House;
import service.HouseService;
import utils.Utility;

import java.util.Scanner;

public class HouseView {

    private boolean toLeave = false;
    private HouseService houseService = new HouseService(2);

    public void mainMenu() {

        Scanner input = new Scanner(System.in);
        while (!toLeave) {
            System.out.println("\n============房屋出租系统============");
            System.out.println("\t\t\t1 新 增 房 屋");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.print("请输入您的选择(1~6): ");
            char choice = Utility.readChar();

            switch (choice) {
                case '1' -> addHouse();
                case '2' -> searchHouse();
                case '3' -> delHouse();
                case '4' -> modifyHouse();
                case '5' -> listHouses();
                case '6' -> exit();
            }
        }
    }

    //列出所有房屋的信息
    public void listHouses() {
        System.out.println("============房屋列表============");
        System.out.println("ID\t\tOwner\t\tPhone\t\tAddress\t\tRent\t\tState(Rented/NotRented)");
        House[] list = houseService.list();
        for (House house : list) {
            if (house == null) {
                continue;
            }
            System.out.println(house);
        }
    }

    //添加房屋
    public void addHouse() {
        System.out.println("============添加房屋============");
        System.out.print("请输入房主姓名: ");
        String owner = Utility.readString(8);

        System.out.print("请输入房主电话: ");
        String phoneNum = Utility.readString(12);

        System.out.print("请输入房屋地址: ");
        String address = Utility.readString(16);

        System.out.print("请输入房屋月租: ");
        int rent = Utility.readInt();

        System.out.print("请输入房屋状态: ");
        String state = Utility.readString(3);

        House house = new House(0, owner, phoneNum, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("添加房屋成功！");
        } else {
            System.out.println("添加房屋失败！");
        }
    }

    //删除房屋
    public void delHouse() {
        System.out.println("============删除房屋信息============");
        System.out.print("请输入要删除的房屋编号(-1退出): ");
        int delIt = Utility.readInt();
        if (delIt == -1) {
            System.out.println("============放弃删除房屋信息============");
            return;
        }
        char ch = Utility.readConfirmSelection();
        if (ch == 'Y') {
            if (houseService.del(delIt)) {
                System.out.println("删除成功!");
            } else {
                System.out.println("房屋编号不存在!删除失败!");
            }
        } else {
            System.out.println("============放弃删除房屋信息============");
        }
    }

    public void exit() {
        char ch = Utility.readConfirmSelection();
        if (ch == 'Y') {
            toLeave = true;
        }
    }

    //搜索房屋
    public void searchHouse() {
        System.out.print("请输入房屋的ID: ");
        int searchID = Utility.readInt();

        House houseToFind = houseService.search(searchID);
        if (houseToFind != null) {
            System.out.println("============房屋信息============");
            System.out.println("ID\t\tOwner\t\tPhone\t\tAddress\t\tRent\t\tState(Rented/NotRented)");
            System.out.println(houseToFind);
        } else {
            System.out.println("您要查找的房屋不存在!");
        }
    }

    //修改房屋信息
    public void modifyHouse() {
        System.out.println("============修改房屋信息============");
        System.out.print("请选择待修改的房屋编号: ");
        int updateID = Utility.readInt();
        if (updateID == -1) {
            System.out.println("============放弃修改房屋信息============");
        }

        House house = houseService.search(updateID);
        if (house == null) {
            System.out.println("修改房屋编号不存在!");
        } else {
            System.out.printf("房主姓名(%s): ", house.getOwner());
            String name = Utility.readString(8, "");
            if (!"".equals(name)) {
                house.setOwner(name);
            }

            System.out.printf("房主电话(%s): ", house.getPhoneNum());
            String phoneNum = Utility.readString(12);
            if (!"".equals(phoneNum)) {
                house.setPhoneNum(phoneNum);
            }

            System.out.printf("房屋地址(%s): ", house.getAddress());
            String address = Utility.readString(18);
            if (!"".equals(address)) {
                house.setAddress(address);
            }

            System.out.printf("房屋租金(%.0f): ", house.getRent());
            int rent = Utility.readInt(-1);
            if (rent != -1) {
                house.setRent(rent);
            }

            System.out.printf("房屋状态(%s): ", house.getState());
            String state = Utility.readString(3, "");
            if (!"".equals(state)) {
                house.setState(state);
            }

            System.out.println("============修改房屋信息成功============");
        }
    }
}
