class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] arr1 = my_string.split("");
        String[] arr2 = is_prefix.split("");
        
        int count = 0;
        if(arr2.length < arr1.length) {
            for(int i=0; i<arr2.length; i++) {
                if(arr2[i].equals(arr1[i])) count++;
            }
        }
        
        
        if(count == arr2.length) return 1;
        else return 0;
    }
}