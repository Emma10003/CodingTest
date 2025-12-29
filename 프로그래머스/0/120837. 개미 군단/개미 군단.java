class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int general = hp / 5;
        hp %= 5;
        int soldier = hp / 3;
        hp %= 3;
        int work = hp / 1;
        
        return general + soldier + work;
    }
}