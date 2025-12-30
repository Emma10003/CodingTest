import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int count = 0;
        ArrayList<Integer> numlist = new ArrayList<>();
        
        while(num > 0) {
            numlist.add(num % 10);
            num /= 10;
        }
        
        Collections.reverse(numlist);
        
        for(int i=0; i<numlist.size(); i++) {
            count ++;
            if(numlist.get(i) == k) return count;
            System.out.printf("%d, %d", numlist.get(i), k);
        }
        return -1;
    }
}