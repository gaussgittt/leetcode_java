/*
26

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

Given nums = [0,0,1,1,1,2,2,3,3,4],
 */

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[size]) {
                nums[++size] = nums[i];
            }
        }
        return size + 1;
    }



    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray solution = new RemoveDuplicateFromSortedArray();
        int[] data = new int[]{0, 1, 1, 2, 3, 3, 3};
        int len = solution.removeDuplicates(data);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + (i == len - 1 ? "" : ", "));
        }
    }
}
