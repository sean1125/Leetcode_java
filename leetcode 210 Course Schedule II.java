// leetcode 210 Course Schedule II.java

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int i, j = 0, tmp, size = prerequisites.length;
        int[] counter = new int[numCourses];
        int[] result = new int[numCourses];
        Queue<Integer> q = new LinkedList<Integer>();

        for (i = 0; i < size; i++)
            counter[prerequisites[i][0]]++;
        for (i = 0; i < numCourses; i++)
            if (counter[i] == 0) q.add(i);
        int num = q.size();

        while (!q.isEmpty()) {
            tmp = q.remove();
            result[j++] = tmp;

            for (i = 0; i < size; i++) {
                if (prerequisites[i][1] == tmp) {
                    counter[prerequisites[i][0]]--;
                    if (counter[prerequisites[i][0]] == 0) {
                        num++;
                        q.add(prerequisites[i][0]);
                    }
                }
            }
        }

        if (num == numCourses) return result;
        else return new int[0];
    }
}
