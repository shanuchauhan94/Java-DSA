package datastructure.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestValue {

    // Using MinHeap tc = klog(k) + (N-k)log(k)
    private static int kthLargestElementInGivenArrayMinHeap(int[] arr, int k) {

        if (k > arr.length) {
            System.err.println("Invalid case");
            return -1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        // already make k size minHeap tree
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
    }

    private static int kthLargestElementInGivenArrayMaxHeap(int[] arr, int k) {

        if (k > arr.length) {
            System.err.println("Invalid case");
            return -1;
        }

        // Collections.reverseOrder()   so return last min node value of maxHeap tree
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <arr.length ; i++) {
            maxHeap.add(arr[i]);
        }
        // already make k size minHeap tree
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 11, 30, 20, 38, 2, 45};
        int k = 3;

        System.out.println("using minHeap -> " + KthLargestValue.kthLargestElementInGivenArrayMinHeap(arr, k));
        System.out.println("using maxHeap -> " + KthLargestValue.kthLargestElementInGivenArrayMaxHeap(arr, k));
    }

}
