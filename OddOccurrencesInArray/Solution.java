class Solution {
    public int solution(int[] A) {
        Set set = new HashSet();
        
        for (int x : A) {
            if (set.contains(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        
        int result = 0;
        if (!set.isEmpty())
            result = (int)set.toArray()[0];
        
        return result;
    }
}