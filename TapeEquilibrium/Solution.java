class Solution {
    public int solution(int[] A) {
        
        int left = 0;
        int right = 0;
        int diff = 0;
        int minDiff = Integer.MAX_VALUE;
        
        // Gets array total
        // Walk from the left to the right   
        for (int i=0; i < A.length; i++) {
            left += A[i];
        }
        
        // Walk from the right to the left
        for (int i=(A.length-1); i > 0; i--) {
            left -= A[i];
            right += A[i];
            diff = Math.abs(left-right);
            
            if (diff < minDiff)
                minDiff = diff;
        }
        
        return minDiff;
    }
}