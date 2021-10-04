/*
Merge Two Sorted Lists II
https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
*/

public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> sorted = new ArrayList<Integer>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < a.size() && p2 < b.size()) {
            if (a.get(p1) < b.get(p2)) {
                sorted.add(a.get(p1));
                p1++;
            } else {
                sorted.add(b.get(p2));
                p2++;
            }
        }

        while (p1 < a.size()) {
            sorted.add(a.get(p1));
            p1++;
        }
        while (p2 < b.size()) {
            sorted.add(b.get(p2));
            p2++;
        }

        a.clear();

        for (Integer num : sorted)
            a.add(num);

        return;
    }
}
