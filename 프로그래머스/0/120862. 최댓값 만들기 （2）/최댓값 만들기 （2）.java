import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int expectMax = numbers[numbers.length-1] * numbers[numbers.length-2];
        int minusMult = numbers[0] * numbers[1];
        
        if(minusMult > expectMax) return minusMult;
        else return expectMax;
    }
}