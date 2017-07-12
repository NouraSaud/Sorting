/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalgo;

import java.util.Random;

/**
 *
 * @author ReemaM
 */
public class TestBubbleSort {
   
    public static void main(String[] args) {
         int n, c, d, swap;

        n = 10000;
        int array[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }

        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d + 1]) /* For descending order use < */ {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }

      

        for (c = 0; c < n; c++) {
            System.out.print(array[c] + " ");
        }
    }
}
