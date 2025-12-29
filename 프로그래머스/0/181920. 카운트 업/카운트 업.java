class Solution {
    public int[] solution(int start_num, int end_num) {
        int n = end_num - start_num;
        int[] answer = new int[n+1];
        for(int i=0; i<=n; i++) {
            answer[i] = start_num;
            start_num++;
        }
        return answer;
    }
}