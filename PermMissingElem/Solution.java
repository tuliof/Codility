import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        if (A.length == 0)
            return 1;
        
        Arrays.sort(A);
        
        int result = 0;
        int target = A[0];
        // Detect a break in a sequence
        // For example, 1 - 2 - 4
        // Will detect that 3 is missing
        for (int x : A) {
            if (target != x) {
                result = target;
                break;
            }
            target++;
        }
        
        // Missing first or last
        // If there is no sequence break, then it must be on the edges
        // For example 100 - 101 - 102
        // It will prioritize the lower limit, if possible, otherwise will increse the upper limit.
        // For example, 1 - 2 - 3, as it can't go lowet than 1, the number will be 4
        if (result == 0) {
            if (A[0] - 1 > 0)
                result = A[0] - 1;
            else
                result = A[A.length-1] + 1;
        }
        
        return result;
    }
}