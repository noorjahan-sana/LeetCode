class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int i = numBottles;
        int totalBottles=0;
        while(numBottles>=numExchange){
            int temp = numBottles/numExchange;
            numBottles = numBottles - temp*numExchange;
            totalBottles = totalBottles + temp;
            numBottles = numBottles + temp;
        }
        return i+totalBottles;
    }
}