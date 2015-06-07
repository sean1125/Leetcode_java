// leetcode 118 Pascal's Triangle.java

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer> > result = new ArrayList<List<Integer> > ();
        int i, j;

        if (numRows == 0) return result;
        result.add(new ArrayList<Integer> ());
        result.get(0).add(1);
        if (numRows == 1) return result;

        result.add(new ArrayList<Integer> ());
        result.get(1).add(1);
        result.get(1).add(1);

        for (i = 2; i < numRows; i++) {
            result.add(new ArrayList<Integer> ());
            result.get(i).add(1);
            for (j = 1; j < i; j++)
                result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            result.get(i).add(1);
        }

        return result;
    }
}
