// leetcode 13 Roman to Integer.java

public class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> m = new HashMap<Character, Integer> ();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int i, size = s.length(), counter = m.get(s.charAt(size - 1));
        
        for (i = size - 2; i >= 0; i--) {
            if (m.get(s.charAt(i)) >= m.get(s.charAt(i + 1))) counter += m.get(s.charAt(i));
            else counter -= m.get(s.charAt(i));
        }

        return counter;
    }
}
