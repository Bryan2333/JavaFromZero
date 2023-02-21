package service;

import model.House;

public class HouseService {
    private House[] houses;
    private int houseNum = 1 ;
    private int idCount = 1; // 记录ID增长到多少了

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "Jack", "1111", "测试区", 2000, "未出租");
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        if (houseNum == houses.length) {
            System.out.println("数组已满，不能再添加!");
            return false;
        }

        houses[houseNum++] = newHouse;
        newHouse.setId(++idCount);
        return true;
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }

        if (index == -1) { //delId在数组中不存在
            return false;
        }

        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }

    public House search(int searchID) {
        for (House house : houses) {
            if (house.getId() == searchID) {
                return house;
            }
        }
        return null;
    }
}
