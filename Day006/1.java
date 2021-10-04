/*
 * Airline Restrictions https://www.codechef.com/SEPT21C/problems/AIRLINE
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
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int D = scan.nextInt();
            int E = scan.nextInt();

            int flag = 0;
            if (A <= E && B + C <= D)
                flag = 1;
            else if (B <= E && A + C <= D)
                flag = 1;
            else if (C <= E && A + B <= D)
                flag = 1;

            if (flag == 1)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
