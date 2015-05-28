// leetcode 209  Minimum Size Subarray Sum.java

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {

        int i = 0, j, size = nums.length, length = size + 1,sum = 0;

        for (j = 0; j < size; j++) {
            sum += nums[j];

            if (sum >= s) {
                while (sum - nums[i] >= s)
                   sum -= nums[i++];
                if (length > j - i + 1) length = j - i + 1;
            }
        }

        return length == size + 1 ? 0 : length;
    }
}
