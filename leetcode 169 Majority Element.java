// leetcode 169 Majority Element.java

public class Solution {
    public int majorityElement(int[] nums) {

        int majority = nums[0], counter = 1, i, size = nums.length;

        for (i = 1; i < size; i++) {
            if (nums[i] == majority) counter++;
            else counter--;

            if (counter == 0) {
                majority = nums[i];
                counter = 1;
            }
        }

        return majority;
    }
}
