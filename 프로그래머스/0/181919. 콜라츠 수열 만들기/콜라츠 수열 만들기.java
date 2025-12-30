import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        arrlist.add(n);
        
        while (n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            }
            else {
                n = 3 * n + 1;
            }
            arrlist.add(n);
        }
        
        int[] answer = new int[arrlist.size()];
        for(int i=0; i<arrlist.size(); i++) {
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}