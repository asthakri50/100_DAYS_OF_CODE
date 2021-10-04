/*
Combination Sum
https://www.interviewbit.com/problems/combination-sum/
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(A);
        helper(A, ans, new ArrayList<>(), B, 0);
        return new ArrayList<>(ans);
    }

    private void helper(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, int b,
            int idx) {
        if (b < 0) {
            return;
        }

        if (b == 0) {
            if (!ans.contains(curr))
                ans.add(new ArrayList<>(curr));
            return;
        }

        if (idx < a.size()) {
            if (a.get(idx) <= b) {
                curr.add(a.get(idx));
                helper(a, ans, curr, b - a.get(idx), idx);
                curr.remove(curr.size() - 1);
            }

            helper(a, ans, curr, b, idx + 1);
        }
    }
}