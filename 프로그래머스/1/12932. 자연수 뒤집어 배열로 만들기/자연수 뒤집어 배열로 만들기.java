class Solution {
    public int[] solution(long n) {
        String numstr = Long.toString(n);
        String[] strlist = numstr.split("");
        
        int[] answerlist = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++) {
            answerlist[i] = Integer.parseInt(strlist[strlist.length - i - 1]);
        }
        return answerlist;
    }
}