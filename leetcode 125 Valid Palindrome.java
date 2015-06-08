// leetcode 125 Valid Palindrome.java

public class Solution {
    public boolean isPalindrome(String s) {

        int size = s.length(), i = 0, j = size - 1;
        s = s.toLowerCase();

        while (i < j) {
            if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') && !(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                i++;
            }
            else if (!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') && !(s.charAt(j) >= '0' && s.charAt(j) <= '9')) {
                j--;
            }
            else {
                if (s.charAt(i) != s.charAt(j)) return false;

                i++;
                j--;
            }
        }

        return true;
    }
}
