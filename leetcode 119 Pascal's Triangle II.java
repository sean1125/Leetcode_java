// leetcode 119 Pascal's Triangle II.java

public class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<Integer> ();
        int i;

        result.add(1);
        if (rowIndex == 0) return result;

        for (i = 1; i < rowIndex; i++)
            result.add((int)((long)result.get(i - 1) * (rowIndex - i + 1) / i));

        result.add(1);

        return result;
    }
}
