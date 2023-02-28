package com.inherited.exercise01;

public class Test {
    public static void main(String[] args) {
        NotePad notepad1 = new NotePad("R7-5800H", 16, 512, "黑色");
        notepad1.printInfo();

        PC pc1 = new PC("R7-5800x", 16, 1024, "联想");
        pc1.printInfo();
    }
}
