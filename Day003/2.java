/*
Count Primes
https://leetcode.com/problems/count-primes/
*/

class Solution {
    public int countPrimes(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 0;

        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j < n; j += i)
                    prime[j] = false;
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (prime[i] == true) {
                count++;
            }
        }

        return count;
    }
}