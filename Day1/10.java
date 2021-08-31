/*
 * Set Matrix Zeroes https://leetcode.com/problems/set-matrix-zeroes/
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        HashSet<Integer> rset = new HashSet<Integer>();
        HashSet<Integer> cset = new HashSet<Integer>();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (matrix[r][c] == 0) {
                    rset.add(r);
                    cset.add(c);
                }
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (rset.contains(r) || cset.contains(c))
                    matrix[r][c] = 0;
            }
        }

        return;
    }
}