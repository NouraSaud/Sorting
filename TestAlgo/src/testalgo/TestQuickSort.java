/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalgo;

/**
 *
 * @author ReemaM
 */
import java.util.Random;

public class TestQuickSort {

    public static void quickSort(int[] z) {
        if (z.length < 0) {
            return;
        }
        quickSortStep(z, 0, z.length - 1);

    }

    private static void quickSortStep(int[] z, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp;
        int pivot = z[right];
        int left2 = left;
        int right2 = right - 1;
        while (left2 <= right2) {
            while ((left2 <= right2) && (z[left2] <= pivot)) {
                left2++;
            }
            while ((right2 >= left2) && (z[right2] >= pivot)) {
                right2--;
            }
            if (left2 < right2) {
                temp = z[right2];
                z[right2] = z[left2];
                z[left2] = temp;
            }
        }
        temp = z[right];
        z[right] = z[left2];
        z[left2] = temp;
        quickSortStep(z, left, left2 - 1);
        quickSortStep(z, left2 + 1, right);
    }

    public static void main(String[] args) {
        int[] x = new int[10000];
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(100);
        }
       
        quickSort(x);
       // System.out.print("\nAfter Sorting: ");
        for (int y = 0; y < x.length; y++) {
            System.out.print(x[y] + " ");
        }

    }
}
