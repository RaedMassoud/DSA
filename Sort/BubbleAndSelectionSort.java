package Sort;

public class BubbleAndSelectionSort {

    // Bubble Sort Starts
    // O(n squared)
    public int[] bubbleSort(int[] arr) {

        // We iterate over the length of the array
        for(int i = 0; i < arr.length; i++) {

            // We iterate over the unsorted part of the array
            for(int j = 0; j < arr.length - i - 1; j++) {

                // Switch elements if needed
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
    // Bubble Sort Ends

    // Selection Sort Starts
    // O(n squared)
    public int[] selectionSort(int[] arr) {

        // Iterate through the array
        for(int i = 0; i < arr.length - 1; i++) {

            // Iterate through all elements after element of index i
            // if any element is smaller than element of index i switch
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }
    // Selection Sort Ends
}
