class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        while(empty>=numExchange)
        {
            int newbottle = empty/numExchange;
            int rem = empty % numExchange;
            total = total + newbottle;
            empty = newbottle + rem;
        }
        return total;
        
    }
}
