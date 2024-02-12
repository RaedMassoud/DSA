package Search;

public class LinearAndBinarySearch {

    // Linear Search Starts
    // O(n)
    public int linearSearch(int[] arr, int target) {

        // The function will iterate through the whole array
        // until it finds the target value OR reaches the end
        // of the array.
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }

        // Return -1 if target is not found
        return -1;
    }
    // Linear Search Ends


    // Binary Search Starts
    // O(log n)
    public int binarySearch(int[] arr, int target, int left, int right) {

        // Check to see if we have reached the end of our search
        if(left <= right) {

            // Find the value at the middle of the array
            int mid = (left + right) / 2;

            // If middle matches our target return the middle value
            if(arr[mid] == target)
                return mid;

            // If the target is smaller than our middle value
            // throw away all values bigger than middle and
            // recall method
            else if(arr[mid] > target)
                return binarySearch(arr, target, left, mid - 1);

            // If target is bigger than our middle value
            // throw away all values smaller than middle
            // and recall method
            else
                return binarySearch(arr, target, mid + 1, right);
        }

        // Return -1 if target does not exist
        return -1;
    }
    // Binary Search Ends

}