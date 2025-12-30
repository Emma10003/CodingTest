class Solution {
    public int solution(int a, int b, int c) {
        
        a *= 1.0;
        b *= 1.0;
        c *= 1.0;
        
        if(a == b) {
            if(a == c) return calc_3(a, b, c); // 3개가 같은 경우
            else return calc_2(a, b, c);  // 2개만 같은 경우
        } else if(a == c) return calc_2(a, b, c);  // 2개만 같은 경우
        else if(b == c) return calc_2(a, b, c);
        else return calc_1(a, b, c);
        
    }
        
    public int calc_1 (int a, int b, int c) {
        return (int)((a + b + c));
    }
    
    public int calc_2 (int a, int b, int c) {
        return (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
    }
    public int calc_3 (int a, int b, int c) {
        return (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
    }
}