// leetcode 219 Contains Duplicate II.java

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int i, size = nums.length;
        Set<Integer> s = new HashSet<Integer>();

        for (i = 0; i < size; i++) {
            if (i - k > 0) s.remove(nums[i - k - 1]);

            if (s.contains(nums[i])) return true;

            s.add(nums[i]);
        }

        return false;
    }
}
