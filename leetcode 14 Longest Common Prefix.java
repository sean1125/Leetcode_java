// leetcode 14 Longest Common Prefix.java

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        int size = strs.length, i, j;
        int[] sizes = new int[size];
        String result = "";

        if (size == 0) return result;

        for (i = 0; i < size; i++)
            sizes[i] = strs[i].length();

        for (i = 0; ; i++) {
            if (i >= sizes[0]) return result;

            for (j = 1; j < size; j++) {
                if (i >= sizes[j]) return result;
                if (strs[j].charAt(i) != strs[0].charAt(i)) return result;
            }

            result += strs[0].charAt(i);
        }
    }
}
