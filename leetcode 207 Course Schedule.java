// leetcode 207 Course Schedule.java

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int i, tmp, size = prerequisites.length;
        int[] counter = new int[numCourses];
        Queue<Integer> q = new LinkedList<Integer>();

        for (i = 0; i < size; i++)
            counter[prerequisites[i][0]]++;
        for (i = 0; i < numCourses; i++)
            if (counter[i] == 0) q.add(i);
        int num = q.size();

        while (!q.isEmpty()) {
            tmp = q.remove();

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

        return num == numCourses;
    }
}
