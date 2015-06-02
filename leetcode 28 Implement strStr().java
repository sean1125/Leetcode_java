// leetcode 28 Implement strStr().java

public class Solution {
    public int strStr(String haystack, String needle) {
        int i, j, n = haystack.length(), m = needle.length();

        for (i = 0; i <= n - m; i++) {
            for (j = 0; j < m && haystack.charAt(i + j) == needle.charAt(j); j++);
            if (j == m) return i;
        }

        return -1;
    }
}
