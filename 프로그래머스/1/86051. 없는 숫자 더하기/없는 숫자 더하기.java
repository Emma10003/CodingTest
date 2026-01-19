import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        
        Arrays.sort(numbers);
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<=9; j++) {
                if(numbers[i] == j) sum -= j;
            }
        }
        
        return sum;
    }
}