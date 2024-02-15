package ProblemsOnSearching.easy;

/**
 * Created by RaedMassoud on 2/15/2024
 *
 * @author: RaedMassoud
 * @date: 2/15/2024
 * @project: DSA
 */
public class LargestThreeElements {

    // A method to return the three largest numbers in an array
    private void find(int[] arr) {
        int first = 0;
        int second = 0;
        int third = 0;

        // Traverse the array
        for(int i = 0; i < arr.length; i++) {

            // if the current value is greater than the first
            // shift elements and replace first
            if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            // if the current value is greater than the second
            // shift elements and replace second
            else if(arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third && arr[i] != second)
                third = arr[i];
        }

        System.out.println(STR."\{first} \{second} \{third}");

    }

}
