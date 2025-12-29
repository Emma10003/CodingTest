class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char temp = my_string.charAt(num1);
        sb.setCharAt(num1, my_string.charAt(num2));
        sb.setCharAt(num2, temp);
        return sb.toString();
    }
}