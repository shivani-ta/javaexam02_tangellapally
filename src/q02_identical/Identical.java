/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q02_identical;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Shivani tangellapally
 */
public class Identical {

    /**
     * @param m1
     * @param m2
     * @return 
     */
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length == m2.length) {
            for (int i = 0; i < sqrt(m1.length); i++) {
                for (int j = 0; j < sqrt(m1.length); j++) {
                    if (m1[i][j] != m2[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.print("Enter List1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter List2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();
            }
        }
        if (equals(m1, m2) == true) {
            System.out.println("Two arrays are Strictly identical");
        } else {
            System.out.println("Two Arrays are not strictly identical");
        }
    }
}
