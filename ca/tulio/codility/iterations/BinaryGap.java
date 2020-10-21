package ca.tulio.codility.iterations;

class BinaryGap {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);

        int longest = 0;
        int count = 0;

        for (char i : binary.toCharArray()) {
            if (i == '1') {
                if (count > longest) {
                    longest = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        
        return longest;
    }
}