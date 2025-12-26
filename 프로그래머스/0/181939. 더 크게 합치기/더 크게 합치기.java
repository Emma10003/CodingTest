class Solution {
    public int solution(int a, int b) {
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        
        int AB = Integer.parseInt(A + B);
        int BA = Integer.parseInt(B + A);;
        
        if(AB >= BA) return AB;
        else return BA;
    }
}