class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        String[] strlist = myString.split("");
        
        for(int i=0; i<myString.length(); i++) {
            if(strlist[i].equals("A")) answer += "B";
            else answer += "A";
        }
        
        if(answer.contains(pat)) return 1;
        else return 0;
    }
}