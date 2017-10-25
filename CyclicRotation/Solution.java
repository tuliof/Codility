import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] A, int K) {
        // Won't rotate anything if A is empty or if K is zero
        if (A.length == 0 || K == 0)
            return A;
        
        // Could do a check in case K amount of rotation would leave A in its original form
        // If the length divided by the rotation counter(K) is even, the resulting rotated array will be the same as A.
        /*System.out.println("A Length: " + A.length);
        int mod = A.length % K;
        System.out.println("Mod: " + mod);
        if (mod == 0 || mod == 5) {
            System.out.println("Array is even!");
            return A;
        }*/
        
        LinkedList<Integer> ll = new LinkedList(Arrays.stream(A).boxed().collect(Collectors.toList()));
        
        for  (int i = 0; i < K; i++) {
            ll.addFirst(ll.pollLast());
        }
        
        int[] result = ll.stream().mapToInt(val -> val).toArray();   
        
        return result;
    }
}