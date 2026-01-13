class Solution {
    public int solution(int n) {
        int idx = 1;
        for(int i=1; i<=n; i++) {
            if(n%i == 1) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}