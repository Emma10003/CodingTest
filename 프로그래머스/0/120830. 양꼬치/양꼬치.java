class Solution {
    public int solution(int n, int k) {
        if(n > 0) return (n * 12000) + (k * 2000) - (n/10) * 2000;
        else return (n * 12000) + (k * 2000);
    }
}