package ProblemsOnSearching.easy;

/**
 * Created by RaedMassoud on 2/15/2024
 *
 * @author: RaedMassoud
 * @date: 2/15/2024
 * @project: DSA
 */
public class MissingNumber {

    // Return the missing number provided a collection of range [1, N]
    public int findMissing(int[] arr) {

        int sum = 0;
        int n = arr.length + 1;

        // calculate actual sum
        for(int i : arr)
            sum += i;

        // return supposed sum - actual sum
        // total sum of number from 1 to n is defined as (N*(N+1)) / 2
        return ((n * (n+1))/2 - sum);

    }
}
