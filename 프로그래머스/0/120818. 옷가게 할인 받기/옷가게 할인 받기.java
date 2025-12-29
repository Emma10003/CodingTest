class Solution {
    public int solution(int price) {
        if(price < 100000) return price;
        else if(price >= 100000 && price < 300000) return (price*=0.95)*1;
        else if(price >= 300000 && price < 500000) return (price*=0.9)*1;
        else return (price*=0.8)*1;
    }
}