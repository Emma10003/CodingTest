class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] strlist = my_string.split("");
        
        for(int i=0; i<strlist.length; i++) {
            if(strlist[i].equals(alp)) strlist[i] = strlist[i].toUpperCase();
            answer += strlist[i];
        }
        
        
        return answer;
    }
}