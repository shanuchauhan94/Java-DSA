package problems;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveIntervals {

    public static int removeCoveredIntervals(int[][] intervals) {

        int res = 0, left = -1, right = -1;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int[] v : intervals) {
            if (v[0] > left && v[1] > right) {
                left = v[0];
                ++res;
            }
            right = Math.max(right, v[1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 6}, {4, 6}, {4, 8}};
        int res = removeCoveredIntervals(intervals);
        System.err.println("res " + res);
    }

    public static class SortingHashMapBasedOnKAndV {

        public static void main(String[] args) {

        }
    }
}
