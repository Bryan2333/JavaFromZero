package Recursion;

public class MiGong {
    public static void main(String[] args) {

        // 0表示可以走 1表示障碍物
        int[][] map = new int[8][7];
        //最上面一行和最下面一行为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        //最左边和最右边一列为1
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        Mouse.findWay(map,1,1);
        System.out.println("count = " + Mouse.count);
        for (int[] i : map) {
            for (int j : i) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }


    }
}

class Mouse {

/*  1 1 1 1 1 1 1
    1 0 0 0 0 0 1
    1 0 0 0 0 0 1
    1 1 1 0 0 0 1
    1 0 0 0 0 0 1
    1 0 0 0 0 0 1
    1 0 0 0 0 0 1
    1 1 1 1 1 1 1  */

    // 2表示可以走， 3表示走过的死路
    // 当[6][5]为2时，表示已经找到通路，可以退出，否则继续找
    // 找路策略 下 -> 右 -> 上 -> 左

    public static int count = 0;
    public static boolean findWay(int[][] map, int i, int j) {
        if (map == null) {
            return false;
        }
        if (map[6][5] == 2) {
            count++;
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                count++;
                if (findWay(map, i+1, j)) { //走下
                    return true;
                } else if (findWay(map, i, j+1)) { //走右
                    return true;
                } else if (findWay(map, i-1, j)) { //走上
                    return true;
                } else if (findWay(map, i, j-1)) { //走左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
