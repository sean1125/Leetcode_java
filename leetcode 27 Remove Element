// leetcode 27 Remove Element

public class Solution {
    public int removeElement(int[] nums, int val) {
        int faster, slower = 0, size = nums.length, length = size;

        for (faster = 0; faster < size; faster++) {
            if (nums[faster] != val) nums[slower++] = nums[faster];
            else length--;
        }

        return length;
    }
}
