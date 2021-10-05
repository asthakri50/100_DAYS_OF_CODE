/*
 * Permutations https://www.interviewbit.com/problems/permutations/
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        int[] freq = new int[A.size()];
        Arrays.fill(freq, -1);
        generatePermuations(A, res, ds, freq);

        return res;
    }

    private void generatePermuations(ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> ds,
            int[] freq) {

        if (ds.size() == nums.size()) {
            if (!res.contains(ds)) {
                res.add(new ArrayList<Integer>(ds));
                return;
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (freq[i] == -1) {
                ds.add(nums.get(i));
                freq[i] = 1;
                generatePermuations(nums, res, ds, freq);

                // Backtrack
                ds.remove(ds.size() - 1);
                freq[i] = -1;
            }
        }
    }
}