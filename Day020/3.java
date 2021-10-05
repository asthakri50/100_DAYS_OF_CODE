/*
 * Three Boxes Problem Code: THREEBOX
 * https://www.codechef.com/OCT21C/problems/THREEBOX
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
            if (A + B + C <= D)
                System.out.println("1");
            else if (A + B <= D || B + C <= D || A + C <= D)
                System.out.println("2");
            else
                System.out.println("3");

        }
    }
}
