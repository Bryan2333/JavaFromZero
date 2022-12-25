package com.string;

public class SubString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "lo";
        System.out.println(str1.contains(str2));
        System.out.println(findSubString(str1, str2));
    }

    public static int findSubString(String mainStr, String subStr) {
        if (mainStr == null || subStr == null) {
            return 0;
        }
        int mainStrLen = mainStr.length();
        int subStrLen = subStr.length();

        if (mainStrLen < subStrLen) {
            return 0;
        }

        int flag = 0;
        for (int i = 0, j = 0; i < mainStrLen; i++) {
            char mainStrChar = mainStr.charAt(i);
            char subStrChar = subStr.charAt(j);
            if (mainStrChar == subStrChar) {
                flag = 1;
                j++;
            } else if (j == subStrLen) {
                break;
            } else {
                flag = 0;
                j = 0;
            }
        }
        return flag;
    }
}
