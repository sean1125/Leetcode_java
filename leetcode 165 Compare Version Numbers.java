// leetcode 165 Compare Version Numbers.java

public class Solution {
    List<Integer> getNums(String version) {

        List<Integer> v = new ArrayList<Integer> ();
        int i, counter = 0, size = version.length();

        for (i = 0; i < size; i++) {
            if (version.charAt(i) == '.') {
                v.add(counter);
                counter = 0;
            } else {
                counter *= 10;
                counter += (int)(version.charAt(i) - '0');
            }
        }
        v.add(counter);

        return v;
    }

    public int compareVersion(String version1, String version2) {

        List<Integer> v1 = getNums(version1);
        List<Integer> v2 = getNums(version2);

        int i, size1 = v1.size(), size2 = v2.size();

        for (i = 0; i < size1 && i < size2; i++) {
            if (v1.get(i) > v2.get(i)) return 1;
            if (v1.get(i) < v2.get(i)) return -1; 
        }

        if (i < size1) {
            for (;i < size1; i++)
                if (v1.get(i) > 0)
                    return 1;
            return 0;
        }
        if (i < size2) {
            for (; i < size2; i++)
                if (v2.get(i) > 0)
                    return -1;
            return 0;
        }

        return 0;
    }
}
