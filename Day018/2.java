/*
 * Convert 1D Array Into 2D Array
 * https://leetcode.com/problems/convert-1d-array-into-2d-array/
 */
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res;
        int length = original.length;
        if (m * n > length || m * n < length) {
            res = new int[0][0];
            return res;
        }
        res = new int[m][n];
        int p = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[p];
                p++;
            }
        }
        return res;
    }
}