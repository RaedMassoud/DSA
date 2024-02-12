package Sort;

/**
 Advantages: Divide-and-conquer - Low overhead
 Disadvantages: Worse case is O(n squared) - Not stable
 */

public class QuickSort {

    // Quick Sort
    // O(n log n)
    // Worst case O(n squared)
    public void quickSort(int[] arr, int start, int end) {

        if(start < end) {

            // Find the
            int pi = partition(arr, start, end);

            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);

        }
    }

    // Take the last element as the pivot
    // place the pivot at the correct place
    // place all smaller elements before pivot and
    // all greater elements after pivot
    public int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++) {

            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
}
