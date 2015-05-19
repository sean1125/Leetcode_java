// leetcode 66 Plus One

public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1, sum, i, size = digits.length;

        for (i = size - 1; i >= 0 && carry > 0; i--) {
            sum = (carry + digits[i]) % 10;
            carry = (carry + digits[i]) / 10;
            digits[i] = sum;
        }

        if (carry == 0) return digits;

        int[] result = new int[size + 1];
        result[0] = 1;
        return result;
    }
}
