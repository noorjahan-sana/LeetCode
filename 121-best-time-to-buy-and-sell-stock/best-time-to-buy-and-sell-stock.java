class Solution {
    public int maxProfit(int[] prices) {
        // int profit=0,buy=0,sell=0, b=0,s=0;
        // for(int i =0 ;i<prices.length-1;i++){
        //     buy = prices[i];
        //     for(int j=i+1;j<prices.length;j++){
        //         sell = prices[j];
        //         // profit = Math.max(profit, buy-sell);
        //         if(sell-buy>profit && prices[i]<prices[j]){
        //             profit = sell-buy;
        //             b=i;
        //             s=j;
        //         }
        //     }
        // }
        // // System.out.println(b+" "+s);
        // return profit;
         int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}