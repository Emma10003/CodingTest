class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] strlist = my_string.split("");
        
        for(int i=0; i<index_list.length; i++) {
            answer += strlist[index_list[i]];
        }
        return answer;
    }
}