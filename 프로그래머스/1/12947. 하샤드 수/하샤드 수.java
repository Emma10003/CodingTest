class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        String[] strarr = str.split("");
        int sum = 0;
        
        for(int i=0; i<str.length(); i++) {
            sum += Integer.parseInt(strarr[i]);
        }
        
        if(x % sum == 0) return true;
        return false;
    }
}