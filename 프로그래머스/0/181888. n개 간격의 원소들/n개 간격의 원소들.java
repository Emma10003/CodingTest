import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<num_list.length; i+=n) {
            arr.add(num_list[i]);
        }
        
        int[] numlist = new int[arr.size()];
        for(int i=0; i<numlist.length; i++) {
            numlist[i] = arr.get(i);
        }
        return numlist;
    }
}