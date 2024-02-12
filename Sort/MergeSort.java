package Sort;

/**
Advantages: Stable - Guaranteed worst-case performance
Disadvantages: Space complexity - Not suited for smaller data sets
 */

public class MergeSort {

    // Merge Sort
    // O(n log n)
    private void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end - 1) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {

        // Find the size of both sub arrays
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for(int i = 0; i < n1; ++i)
            L[i] = arr[start + i];

        for(int j = 0; j < n2; ++j)
            R[j] = arr[mid + j + 1];

        // Merge temp arrays
        // Initial index for both sub arrays
        int i = 0, j = 0;

        // Initial index for the new merged sub arrays
        int k = start;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
