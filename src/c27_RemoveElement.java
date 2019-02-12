/*
Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

Remove element 3 and re-calculate the length

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.
 */

public class c27_RemoveElement {
    public int removeElement(int[] nums, int val) {

        int count = 0;
        for(int i : nums){
            if(i != val){
                nums[count] = i;
                ++count;
            }
        }

        return count;
    }

    public static void main(String[] args){
        c27_RemoveElement r = new c27_RemoveElement();

        int val = 3;
        int[] nums = new int[]{1, 3, 5, 7};

        int length = r.removeElement(nums, val);

        System.out.println(length);

    }
}
