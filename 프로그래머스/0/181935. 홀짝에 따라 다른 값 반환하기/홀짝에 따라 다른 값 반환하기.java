class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 != 0) {
            // 홀수일 때
            int oddSum = 0;
            for(int i=1; i<=n; i++) {
                oddSum += i%2 != 0 ? i : 0;
            }
            return oddSum;
        } else {
            // 짝수일 때
            int evenSum = 0;
            for(int i=1; i<=n; i++) {
                evenSum += i%2 == 0 ? i*i : 0;
            }
            return evenSum;
        }
    }
}