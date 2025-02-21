package Easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) 
    {
        if(prices == null ||prices.length == 0)
        {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices)
        {
            min = Math.min(price,min);
            maxProfit = Math.max(maxProfit, price - min);
        }

        return maxProfit;
    }
}
