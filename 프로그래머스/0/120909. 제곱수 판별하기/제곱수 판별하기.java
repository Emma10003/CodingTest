import java.lang.Math.*;

class Solution {
    public int solution(int n) {
        double squared = Math.sqrt(n);
        return (squared * 10) % 5 == 0 ? 1 : 2;
    }
}