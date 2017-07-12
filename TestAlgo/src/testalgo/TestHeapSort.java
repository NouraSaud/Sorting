/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalgo;

/*
 Heapsort can be thought of as an improved selection sort: like that algorithm,
it divides its input into a sorted and an unsorted region, and it iteratively
shrinks the unsorted region by extracting the largest element and moving
that to the sorted region. The improvement consists of th
e use of a heap data structure rather than a linear-time search
to find the maximum.

. The heapsort algorithm can be divided into two parts. In the second step, 
a sorted array is created by repeatedly removing the largest element 
from the heap (the root of the heap), and inserting it into the array. 
The heap is updated after each removal to maintain the heap.
 */
import java.util.Random;

public class TestHeapSort {

    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    public static void buildheap(int[] a) {
        n = a.length - 1;
        for (int i = n / 2; i >= 0; i--) {
            maxheap(a, i);
        }
    }

    public static void maxheap(int[] a, int i) {
        left = 2 * i;
        right = 2 * i + 1;
        if (left <= n && a[left] > a[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right <= n && a[right] > a[largest]) {
            largest = right;
        }
        if (largest != i) {
            exchange(i, largest);
            maxheap(a, largest);
        }
    }

    public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void sort(int[] a0) {
        a = a0;
        buildheap(a);

        for (int i = n; i > 0; i--) {
            exchange(0, i);
            n = n - 1;
            maxheap(a, 0);
        }
    }

    public static void main(String[] args) {
        int N = 100000;
        int[] sequence = new int[N];
        Random random = new Random();

        

        for (int i = 0; i < N; i++) {
            sequence[i] = Math.abs(random.nextInt(1000));
        }

       
        sort(sequence);

        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
