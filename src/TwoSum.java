/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,  return [0, 1].

 */


import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < len; ++i) {
            if(hashMap.containsKey(nums[i])){
                return new int[]{hashMap.get(nums[i]), i};
            }

            hashMap.put(target-nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = new int[]{1, 3, 5, 7};
        int target = 8;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

    }
}
