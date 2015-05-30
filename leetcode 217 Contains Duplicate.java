// leetcode 217 Contains Duplicate.java

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        int i, size = nums.length;
        Set<Integer> s = new HashSet<Integer> ();

        for (i = 0; i < size; i++) {
            if (s.contains(nums[i]))
                return true;
            s.add(nums[i]);
        }

        return false;
    }
}
