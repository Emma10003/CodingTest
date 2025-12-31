class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        int plus = Integer.parseInt(aa + bb);
        
        return Math.max(plus, 2 * a * b);
    }
}