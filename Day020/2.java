/*
 * Which Mixture Problem Code: MIXTURE
 * https://www.codechef.com/OCT21C/problems/MIXTURE
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

            if (A > 0 && B > 0)
                System.out.println("Solution");
            else if (A == 0)
                System.out.println("Liquid");
            else if (B == 0)
                System.out.println("Solid");
        }
    }
}
