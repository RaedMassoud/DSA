package Sort;

public class InsertionSort {

    // Insertion Sort
    // O(n squared)
    public int[] insertionSort(int[] arr) {

        // Iterate through the array
        // start with the second element and
        // compare with the element before
        for(int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Keep shifting the elements forward as long
            // as the current element is greater than the key
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr;
    }
}
