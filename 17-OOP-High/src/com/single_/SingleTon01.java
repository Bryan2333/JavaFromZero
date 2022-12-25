package com.single_;

public class SingleTon01 {
    public static void main(String[] args) {

        GirlFriend gf = GirlFriend.getInstance();
    }
}

class GirlFriend {
    private String name;

    private static GirlFriend gf = new GirlFriend("test");
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }
}
