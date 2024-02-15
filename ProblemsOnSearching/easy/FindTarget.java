package ProblemsOnSearching.easy;

import java.util.Arrays;

/**
 * Created by RaedMassoud on 2/15/2024
 *
 * @author: RaedMassoud
 * @date: 2/15/2024
 * @project: DSA
 */

// An Array of integers is given, both +ve and -ve. You need to find the
// two elements such that their sum is closest to the given target.
public class FindTarget {

    // Find the two numbers with the diff closest to target
    private static int[] findMinSum(int[] arr, int target) {

        // Sort the array
        Arrays.sort(arr);

        // Initialize variables
        int[] result = new int[2];
        int minDiff = Integer.MAX_VALUE;

        // Initialize left and right
        for(int low = 0, high = arr.length -1; low < high;) {

            // sum left and right
            // get the absolute difference between target and the sum
            int sum = arr[low] + arr[high];
            int diff = Math.abs(target - sum);

            // if difference is smaller than current minimum replace minimum
            // update result set
            if(diff < minDiff) {
                minDiff = diff;
                result[0] = arr[low];
                result[1] = arr[high];
            }

            // if sum is greater than the target decrement high
            // and if sum is lower than target increment low
            if(sum > target)
                high--;
            else if(sum < target)
                low++;
            else
                break;

        }
        // Return result set
        return result;
    }


    // Find the two elements with difference equal to target
    public static int[] findTarget(int[] arr, int target) {

        // Initialize result array and sort the given array
        int[] result = new int[2];
        Arrays.sort(arr);

        //
        for(int low = 0, high = arr.length - 1; low < high;) {

            int diff = arr[low] - arr[high];

            // If difference between low and high is equal to target
            // return solution
            if(Math.abs(diff) == target){
                result[0] = low;
                result[1] = high;
                return result;
            }

            // If difference is bigger than target move right pointer to the left
            else if(diff > target)
                high--;

            // If difference is smaller than target move left pointer to the right
            else if(diff < target)
                low++;

        }

        // NO SOLUTION FOUND
        return result;
    }

}
