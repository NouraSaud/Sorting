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
         int  c, d, swap;

        
        final int n[] = new Random().ints(1, 100000).distinct().limit(99999).toArray();         //array of unique numbers           
         
 
        for (c = 0; c < (n.length - 1); c++) {
            for (d = 0; d < n.length - c - 1; d++) {
                if (n[d] > n[d + 1]) /* For descending order use < */ {
                    swap = n[d];
                    n[d] = n[d + 1];
                    n[d + 1] = swap;
                }
            }
        }

      

        for (c = 0; c < n.length; c++) {
            System.out.print(n[c] + " ");
        }
    }
}
