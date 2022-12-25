//杨辉三角形

public class YangHuiArray {
    public static void main(String[] args) {

        int[][] yangHuiArray = new int[10][];

        for (int i = 0; i < yangHuiArray.length; i++) {
            yangHuiArray[i] = new int[i+1];
            for (int j = 0; j < yangHuiArray[i].length; j++) {
                //每个数组的第一个元素和最后一个元素为1
                if (j == 0 || j == yangHuiArray[i].length - 1) {
                    yangHuiArray[i][j] = 1;
                } else {
                    yangHuiArray[i][j] = yangHuiArray[i-1][j] + yangHuiArray[i-1][j-1];
                }
            }
        }

        for (int[] i : yangHuiArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
