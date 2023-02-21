package TypeChange;

public class temp {
    public static void main(String[] args) {
        int[] array = new int[] {3, 2, 4};
        int[] result = Solution.twoSum(array, 6);
        for(var i : result) {
            System.out.println(i);
        }
    }
}

class Solution{
    public static int[] twoSum(int[] nums, int target){
        int[] result = {0};
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target && i < j) {
                    result = new int[] {i, j};
                }
            }
        }
        return result;
    }
}