/*
Minimum Absolute Difference
https://leetcode.com/problems/minimum-absolute-difference/
*/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List li = new ArrayList<Integer>();

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] < min) {
                res.clear();
                li = new ArrayList<Integer>();
                li.add(arr[i - 1]);
                li.add(arr[i]);
                res.add(li);
                min = arr[i] - arr[i - 1];

            } else if (arr[i] - arr[i - 1] == min) {
                li = new ArrayList<Integer>();
                li.add(arr[i - 1]);
                li.add(arr[i]);
                res.add(li);
            }
        }

        return res;
    }
}