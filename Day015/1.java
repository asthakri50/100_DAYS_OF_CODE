/*
 * Spiral Order Matrix I
 * https://www.interviewbit.com/problems/spiral-order-matrix-i/
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int startrow = 0;
        int endrow = A.size() - 1;

        int startcol = 0;
        int endcol = A.get(0).size() - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // move right
            for (int i = startcol; i <= endcol; i++)
                res.add(A.get(startrow).get(i));

            startrow++;

            // move down
            for (int i = startrow; i <= endrow; i++)
                res.add(A.get(i).get(endcol));

            endcol--;
            if (startrow <= endrow) {
                // move left
                for (int i = endcol; i >= startcol; i--)
                    res.add(A.get(endrow).get(i));
            }
            endrow--;
            // move up
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--)
                    res.add(A.get(i).get(startcol));
            }
            startcol++;

        }

        return res;
    }
}
