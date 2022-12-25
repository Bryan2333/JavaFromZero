package com.generic.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        Dao<User> userDao = new Dao<>();
        userDao.save("001", new User(1, 23, "smith"));
        userDao.save("002", new User(2, 20, "jack"));
        userDao.save("003", new User(3, 22, "peter"));

        List<User> list = userDao.list();
        for (User user : list) {
            System.out.println(user);
        }

        userDao.update("002", new User(2, 35, "milan"));
        userDao.delete("001");
        System.out.println("\n修改后");
        list = userDao.list();
        for (User user : list) {
            System.out.println(user);
        }

        System.out.println("\nid003 = " + userDao.get("003"));
    }
}

