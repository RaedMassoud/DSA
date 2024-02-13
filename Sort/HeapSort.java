package Sort;

/**
 * Advantages: Guaranteed worst-case performance
 * Disadvantages: Unstable - Costly
 */

public class HeapSort {

    // Heap Sort
    // O(n log n)
    public void heapSort(int[] arr, int size) {

        // Build the heap
        for(int i = size / 2 - 1; i >= 0; i--)
            heapify(arr, size, i);

        // Remove root element form heap
        for(int i = size - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Invoke max heap on reduced heap
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int size, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && arr[left] > arr[largest])
            largest = left;

        if(right < size && arr[right] > arr[largest])
            largest = right;

        if(largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, size, largest);
        }

    }
}
