/*
 * Anti Diagonals https://www.interviewbit.com/problems/anti-diagonals/
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int startrow = 0;
        int endrow = A.size() - 1;
        int startcol = 0;
        int endcol = A.get(0).size() - 1;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        for (int i = startcol; i <= endcol; i++) {
            ArrayList<Integer> li = new ArrayList<>();
            int rowbegin = startrow;
            int colbegin = i;

            while (rowbegin <= endrow && colbegin >= 0) {
                li.add(A.get(rowbegin).get(colbegin));
                rowbegin++;
                colbegin--;
            }

            res.add(li);
        }

        startrow = 1;

        for (int i = startrow; i <= endrow; i++) {
            ArrayList<Integer> li = new ArrayList<>();

            int colbegin = endcol;

            int rowbegin = i;

            while (rowbegin <= endrow && colbegin >= 0) {
                li.add(A.get(rowbegin).get(colbegin));
                rowbegin++;
                colbegin--;
            }
            res.add(li);
        }
        return res;
    }
}