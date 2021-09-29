/*
 * Wave Array https://www.interviewbit.com/problems/wave-array/
 */

public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);

        for (int i = 1; i < A.length; i += 2) {
            int temp = A[i];
            A[i] = A[i - 1];
            A[i - 1] = temp;
        }

        return A;
    }
}
/*
 * //This can be done in O(n) time by doing a single traversal of given array. T
 * he idea is based on the fact that if we make sure that all even positioned
 * (at index 0, 2, 4, ..) elements are greater than their adjacent odd elements,
 * we don’t need to worry about odd positioned element. Following are simple
 * steps. 1) Traverse all even positioned elements of input array, and do
 * following. ….a) If current element is smaller than previous odd element, swap
 * previous and current. ….b) If current element is smaller than next odd
 * element, swap next and current.
 */

// A O(n) Java program to sort an input array in wave form
class SortWave {
    // A utility method to swap two numbers.
    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    void sortInWave(int arr[], int n) {
        // Traverse all even elements
        for (int i = 0; i < n; i += 2) {
            // If current even element is smaller
            // than previous
            if (i > 0 && arr[i - 1] > arr[i])
                swap(arr, i - 1, i);

            // If current even element is smaller
            // than next
            if (i < n - 1 && arr[i] < arr[i + 1])
                swap(arr, i, i + 1);
        }
    }

    // Driver program to test above function
    public static void main(String args[]) {
        SortWave ob = new SortWave();
        int arr[] = { 10, 90, 49, 2, 1, 5, 23 };
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
