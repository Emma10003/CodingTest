class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspList = rsp.split("");
        String[] answerList = new String[rsp.length()];
        for(int i=0; i<rspList.length; i++) {
            if(rspList[i].equals("2")) answer += "0";
            else if(rspList[i].equals("0")) answer += "5";
            else answer += "2";
        }
        
        return answer;
    }
}