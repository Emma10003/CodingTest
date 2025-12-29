class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                // 짝수
                even += Integer.toString(num_list[i]);
            } else {
                // 홀수
                odd += Integer.toString(num_list[i]);
            }
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}