class Solution {
    public long solution(int price, int money, int count) {
        long total_cost = 0;
        int new_price = price;

        for(int i = 0; i < count; i++){
            total_cost += new_price;
            new_price += price;
        }

        if (total_cost <= money){
            return 0;
        }
        return total_cost - money;
    }
}