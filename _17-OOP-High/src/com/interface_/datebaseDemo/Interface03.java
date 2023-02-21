package com.interface_.datebaseDemo;

public class Interface03 {
    public static void main(String[] args) {
        MariaDB mariaDB = new MariaDB();
        testCon(mariaDB);

    }

    public static void testCon(DBInterface db) {
        if (db != null){
            db.connect();
        }
    }
}
