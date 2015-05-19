// leetcode 26 Remove Duplicates from Sorted Array

public class Solution {
    public int removeDuplicates(int[] nums) {
        int faster, slower = 0, size = nums.length;

        if (size < 2) return size;

        for (faster = 1; faster < size; faster++) {
            if (nums[faster] != nums[slower]) nums[++slower] = nums[faster];
        }

        return slower + 1;
    }
}
