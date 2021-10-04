/*
 * Spiral Matrix https://leetcode.com/problems/spiral-matrix/
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;

        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            // Move Right
            for (int i = colBegin; i <= colEnd; i++) {
                res.add(matrix[rowBegin][i]);
            }

            rowBegin++;

            // Move Down
            for (int j = rowBegin; j <= rowEnd; j++) {
                res.add(matrix[j][colEnd]);
            }

            colEnd--;

            if (rowBegin <= rowEnd) {
                // Move left
                for (int i = colEnd; i >= colBegin; i--) {
                    res.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;

            if (colBegin <= colEnd) {
                // Move up
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(matrix[j][colBegin]);
                }
            }

            colBegin++;
        }

        return res;
    }
}