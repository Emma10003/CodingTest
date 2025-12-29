class Solution {
    public int[] solution(int n) {
        int count = (n%2==0) ? n/2 : n/2 + 1;
        int startNum = 1;
        int[] answer = new int[count];
        
        for(int i=0; i<count; i++) {
            answer[i] = startNum;
            startNum += 2;            
        }
        
        return answer;
    }
}