/*
 * Shuffling Parities https://www.codechef.com/SEPT21C/problems/SHUFFLIN
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

        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int evenpos = N / 2;
            int oddpos = N - evenpos;
            int even = 0;
            int odd = 0;

            for (int j = 0; j < N; j++) {
                int num = scan.nextInt();
                if (num % 2 == 0)
                    even++;
                else
                    odd++;
            }

            System.out.println(Math.min(evenpos, odd) + Math.min(oddpos, even));
        }
    }
}
