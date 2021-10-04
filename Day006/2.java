/*
 * Travel Pass https://www.codechef.com/SEPT21C/problems/TRAVELPS
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int[] freq = new int[2];

        for (int i = 0; i < T; i++) {
            Arrays.fill(freq, 0);
            int N = scan.nextInt();
            int A = scan.nextInt();
            int B = scan.nextInt();
            String s = scan.next();

            if (N == 0) {
                System.out.println(0);
                continue;
            }

            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == '0')
                    freq[0]++;
                else
                    freq[1]++;
            }

            System.out.println(freq[0] * A + freq[1] * B);

        }

    }
}
